/**
 * @class OrientTdm.Collab.MyTask.Calendar.form.EventDetails
 * @extends Ext.form.Panel
 * <p>A custom form used for detailed editing of events.</p>
 * <p>This is pretty much a standard form that is simply pre-configured for the options needed by the
 * calendar components. It is also configured to automatically bind records of type {@link OrientTdm.Collab.MyTask.Calendar.EventRecord}
 * to and from the form.</p>
 * <p>This form also provides custom events specific to the calendar so that other calendar components can be easily
 * notified when an event has been edited via this component.</p>
 * <p>The default configs are as follows:</p><pre><code>
 fieldDefaults: {
        msgTarget: 'side',
        labelWidth: 65
    },
 title: 'Event Form',
 titleTextAdd: 'Add Event',
 titleTextEdit: 'Edit Event',
 bodyStyle: 'background:transparent;padding:20px 20px 10px;',
 border: false,
 buttonAlign: 'center',
 autoHeight: true,
 cls: 'ext-evt-edit-form',
 </code></pre>
 * @constructor
 * @param {Object} config The config object
 */
Ext.define('OrientTdm.Collab.MyTask.Calendar.form.EventDetails', {
    extend: 'Ext.form.Panel',
    alias: 'widget.orienteventeditform',

    requires: [
        'OrientTdm.Collab.MyTask.Calendar.form.field.DateRange',
        'OrientTdm.Collab.MyTask.Calendar.form.field.ReminderCombo',
        'OrientTdm.Collab.MyTask.Calendar.data.EventMappings',
        'OrientTdm.Collab.MyTask.Calendar.form.field.TaskTypeCombo'
    ],

    fieldDefaults: {
        msgTarget: 'side',
        labelWidth: 65
    },
    title: 'Event Form',
    titleTextAdd: 'Add Event',
    titleTextEdit: 'Edit Event',
    bodyStyle: 'background:transparent;padding:20px 20px 10px;',
    border: false,
    buttonAlign: 'center',
    autoHeight: true,
    // to allow for the notes field to autogrow
    cls: 'ext-evt-edit-form',

    // private properties:
    newId: 10000,
    layout: 'column',

    // private
    initComponent: function () {

        this.addEvents({
            /**
             * @event eventadd
             * Fires after a new event is added
             * @param {OrientTdm.Collab.MyTask.Calendar.form.EventDetails} this
             * @param {OrientTdm.Collab.MyTask.Calendar.EventRecord} rec The new {@link OrientTdm.Collab.MyTask.Calendar.EventRecord record} that was added
             */
            eventadd: true,
            /**
             * @event eventupdate
             * Fires after an existing event is updated
             * @param {OrientTdm.Collab.MyTask.Calendar.form.EventDetails} this
             * @param {OrientTdm.Collab.MyTask.Calendar.EventRecord} rec The new {@link OrientTdm.Collab.MyTask.Calendar.EventRecord record} that was updated
             */
            eventupdate: true,
            /**
             * @event eventdelete
             * Fires after an event is deleted
             * @param {OrientTdm.Collab.MyTask.Calendar.form.EventDetails} this
             * @param {OrientTdm.Collab.MyTask.Calendar.EventRecord} rec The new {@link OrientTdm.Collab.MyTask.Calendar.EventRecord record} that was deleted
             */
            eventdelete: true,
            /**
             * @event eventcancel
             * Fires after an event add/edit operation is canceled by the user and no store update took place
             * @param {OrientTdm.Collab.MyTask.Calendar.form.EventDetails} this
             * @param {OrientTdm.Collab.MyTask.Calendar.EventRecord} rec The new {@link OrientTdm.Collab.MyTask.Calendar.EventRecord record} that was canceled
             */
            eventcancel: true
        });

        this.titleField = new Ext.form.Text({
            fieldLabel: '????????????',
            name: OrientTdm.Collab.MyTask.Calendar.data.EventMappings.Title.name,
            emptyText: '????????????',
            allowBlank: false,
            anchor: '90%'
        });
        this.dateRangeField = new OrientTdm.Collab.MyTask.Calendar.form.field.DateRange({
            fieldLabel: '????????????',
            singleLine: false,
            anchor: '90%'
        });
        this.reminderField = new OrientTdm.Collab.MyTask.Calendar.form.field.ReminderCombo({
            name: '????????????',
            anchor: '70%'
        });
        this.notesField = new Ext.form.TextArea({
            fieldLabel: '????????????',
            name: OrientTdm.Collab.MyTask.Calendar.data.EventMappings.Notes.name,
            grow: true,
            growMax: 150,
            anchor: '100%'
        });

        var leftFields = [this.titleField, this.dateRangeField, this.reminderField],
            rightFields = [this.notesField];

        if (this.taskTypeStore) {
            this.taskTypeField = new OrientTdm.Collab.MyTask.Calendar.form.field.TaskTypeCombo({
                store: this.taskTypeStore,
                anchor: '70%',
                name: OrientTdm.Collab.MyTask.Calendar.data.EventMappings.TaskTypeId.name
            });
            leftFields.splice(2, 0, this.calendarField);
        }

        this.items = [{
            id: 'left-col',
            columnWidth: 0.65,
            layout: 'anchor',
            border: false,
            items: leftFields
        },
            {
                id: 'right-col',
                columnWidth: 0.35,
                layout: 'anchor',
                border: false,
                items: rightFields
            }];

        this.fbar = [{
            cls: 'ext-del-btn',
            itemId: this.id + '-del-btn',
            text: 'Delete Event',
            scope: this,
            handler: this.onDelete,
            minWidth: 150
        },
            {
                text: 'Save',
                scope: this,
                handler: this.onSave
            },
            {
                text: 'Cancel',
                scope: this,
                handler: this.onCancel
            }];

        this.callParent(arguments);
    },

    // inherited docs
    loadRecord: function (rec) {
        this.form.reset().loadRecord.apply(this.form, arguments);
        this.activeRecord = rec;
        this.dateRangeField.setValue(rec.data);

        if (this.taskTypeStore) {
            this.form.setValues({
                'taskTypeId': rec.data[OrientTdm.Collab.MyTask.Calendar.data.EventMappings.TaskTypeId.name]
            });
        }

        if (rec.phantom) {
            this.setTitle(this.titleTextAdd);
            this.down('#' + this.id + '-del-btn').hide();
        }
        else {
            this.setTitle(this.titleTextEdit);
            this.down('#' + this.id + '-del-btn').show();
        }
        this.titleField.focus();
    },

    // inherited docs
    updateRecord: function () {
        var dates = this.dateRangeField.getValue(),
            M = OrientTdm.Collab.MyTask.Calendar.data.EventMappings,
            rec = this.activeRecord,
            fs = rec.fields,
            dirty = false;

        rec.beginEdit();

        // Unfortunately since that method internally calls begin/endEdit all
        // updates happen and the record dirty status is reset internally to
        // that call. We need the dirty status, plus currently the DateRangeField
        // does not map directly to the record values, so for now we'll duplicate
        // the setter logic here (we need to be able to pick up any custom-added 
        // fields generically). Need to revisit this later and come up with a better solution.
        fs.each(function (f) {
            var field = this.form.findField(f.name);
            if (field) {
                var value = field.getValue();
                if (value.getGroupValue) {
                    value = value.getGroupValue();
                }
                else if (field.eachItem) {
                    value = [];
                    field.eachItem(function (item) {
                        value.push(item.getValue());
                    });
                }
                rec.set(f.name, value);
            }
        }, this);

        rec.set(M.StartDate.name, dates[0]);
        rec.set(M.EndDate.name, dates[1]);
        rec.set(M.IsAllDay.name, dates[2]);

        dirty = rec.dirty;
        rec.endEdit();

        return dirty;
    },

    setStartDate: function (d) {
        var me = this,
            duration = me.dateRangeField.getDuration();

        me.dateRangeField.setDT(d, 'start');

        // Set the end time to keep the duration the same
        me.dateRangeField.setDT(new Date(me.dateRangeField.getDT('start').getTime() + duration), 'end');
    },

    setEndDate: function (d) {
        this.dateRangeField.setDT(d, 'end');
    },

    // private
    onCancel: function () {
        this.cleanup(true);
        this.fireEvent('eventcancel', this, this.activeRecord);
    },

    // private
    cleanup: function (hide) {
        if (this.activeRecord && this.activeRecord.dirty) {
            this.activeRecord.reject();
        }
        delete this.activeRecord;

        if (this.form.isDirty()) {
            this.form.reset();
        }
    },

    // private
    onSave: function () {
        if (!this.form.isValid()) {
            return;
        }
        if (!this.updateRecord()) {
            this.onCancel();
            return;
        }
        this.fireEvent(this.activeRecord.phantom ? 'eventadd' : 'eventupdate', this, this.activeRecord);
    },

    // private
    onDelete: function () {
        this.fireEvent('eventdelete', this, this.activeRecord);
    }
});
