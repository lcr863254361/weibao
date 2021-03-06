/**
 * Created by User on 2019/5/18.
 */
Ext.define('OrientTdm.ConsumeMaterialMgr.ConsumeDetailMgr.ConsumeDetailGridPanel', {
    extend: 'OrientTdm.Common.Extend.Panel.OrientPanel',
    alias: 'widget.consumeDetailGridPanel',
    config: {
        schemaId: TDM_SERVER_CONFIG.WEI_BAO_SCHEMA_ID,
        templateName: TDM_SERVER_CONFIG.TPL_CONSUME_DETAIL,
        modelName: TDM_SERVER_CONFIG.CONSUME_DETAIL,
    },

    initComponent: function () {
        var me = this;
        var modelId = OrientExtUtil.ModelHelper.getModelId(me.modelName, me.schemaId);

        if (me.buttonIsShow) {
            var templateName = TDM_SERVER_CONFIG.TPL_SELECT_CONSUME_DETAIL;
            var templateId = OrientExtUtil.ModelHelper.getTemplateId(modelId, templateName);
            var customerFilter = new CustomerFilter('T_SPARE_PARTS_' + me.schemaId + '_ID', CustomerFilter.prototype.SqlOperation.Equal, '', me.spareId);
            var modelGrid = Ext.create('OrientTdm.Common.Extend.Grid.OrientModelGrid', {
                region: 'center',
                modelId: modelId,
                isView: 0,
                templateId: templateId,
                customerFilter: [customerFilter]
            });
        } else {
            var templateId = OrientExtUtil.ModelHelper.getTemplateId(modelId, me.templateName);
            var customerFilter = new CustomerFilter('T_CONSUME_MATERIAL_' + me.schemaId + '_ID', CustomerFilter.prototype.SqlOperation.Equal, '', me.consumeTypeId);
            var modelGrid = Ext.create('OrientTdm.Common.Extend.Grid.OrientModelGrid', {
                region: 'center',
                modelId: modelId,
                isView: 0,
                id: 'consumeMaterialOwner',
                templateId: templateId,
                customerFilter: [customerFilter],
                createUrl: serviceName + "/ConsumeMaterialMgr/addConsumeMaterialData.rdm?consumeTypeId=" + me.consumeTypeId,
                updateUrl: serviceName + '/ConsumeMaterialMgr/updateConsumeMaterialData.rdm',
                afterInitComponent: function () {
                    var toolbar = this.dockedItems[0];
                    toolbar.add(
                        {
                            iconCls: 'icon-import',
                            text: '????????????',
                            disabled: false,
                            itemId: 'import',
                            scope: me,
                            handler: me.ImportConsumeWin
                        }, {
                            iconCls: 'icon-export',
                            text: '????????????',
                            disabled: false,
                            itemId: 'export',
                            scope: me,
                            handler: me.exportConsumeData
                        },
                        {
                            text: '??????',
                            iconCls: 'icon-delete',
                            handler: me._deleteConsumeData,
                            scope: me
                        }
                    );
                }
            });
        }
        Ext.apply(me, {
            layout: 'border',
            items: [modelGrid],
            modelGrid: modelGrid
        });
        me.callParent(arguments);
    },

    _deleteConsumeData: function () {
        var me = this;
        var modelGrid = me.modelGrid;
        if (!OrientExtUtil.GridHelper.hasSelected(modelGrid)) {
            return;
        }
        var selectRecords = OrientExtUtil.GridHelper.getSelectedRecord(modelGrid);
        var ids = [];
        Ext.each(selectRecords, function (s) {
            ids.push(s.data.id);
        });
        OrientExtUtil.AjaxHelper.doRequest(serviceName + '/ConsumeMaterialMgr/delConsumeData.rdm', {
            id: ids.toString()
        }, false, function (resp) {
            var ret = Ext.decode(resp.responseText);
            if (ret.success) {
                modelGrid.fireEvent('refreshGrid');
                // Ext.Msg.alert("??????", "???????????????")
                OrientExtUtil.Common.tip('??????', "???????????????");
            }
        })
    },

    ImportConsumeWin: function () {
        var me = this;
        var win = Ext.create("Ext.Window", {
            title: '??????????????????',
            plain: true,
            height: 110,
            width: '70%',
            layout: 'fit',
            maximizable: true,
            modal: true,
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    layout: 'anchor',
                    defaults: {
                        anchor: '100%',
                        labelAlign: 'left',
                        msgTarget: 'side',
                        labelWidth: 90
                    },
                    items: [{
                        xtype: 'filefield',
                        buttonText: '',
                        fieldLabel: '????????????(.xls???xlsx)',
                        buttonConfig: {
                            iconCls: 'icon-upload'
                        },
                        listeners: {
                            'change': function (fb, v) {
                                if (v.substr(v.length - 3) != "xls" && v.substr(v.length - 4) != "xlsx") {
                                    OrientExtUtil.Common.info('??????', '?????????Excel?????????');
                                    return;
                                }
                            }
                        }
                    }]
                }
            ],
            buttons: [
                {
                    text: '??????',
                    handler: function () {
                        var form = win.down("form").getForm();
                        if (form.isValid()) {
                            form.submit({
                                url: serviceName + '/ConsumeMaterialMgr/importConsumeData.rdm?consumeTypeId=' + me.consumeTypeId,
                                waitMsg: '????????????...',
                                success: function (form, action) {
                                    OrientExtUtil.Common.tip('??????', action.result.msg);
                                    win.close();
                                    Ext.getCmp('consumeMaterialOwner').fireEvent("refreshGrid");
                                },
                                failure: function (form, action) {
                                    switch (action.failureType) {
                                        case Ext.form.action.Action.CLIENT_INVALID:
                                            OrientExtUtil.Common.err('??????', '????????????????????????');
                                            break;
                                        case Ext.form.action.Action.CONNECT_FAILURE:
                                            OrientExtUtil.Common.err('??????', '?????????????????????');
                                            break;
                                        case Ext.form.action.Action.SERVER_INVALID:
                                            OrientExtUtil.Common.err('??????', action.result.msg);
                                    }
                                }
                            });
                        }
                    }
                }
            ]
        });
        win.show();
    },

    exportConsumeData: function () {
        var me = this;
        //var exportButton=this;
        var grid = me.modelGrid;
        var selections = grid.getSelectionModel().getSelection();
        var toExportIds = OrientExtUtil.GridHelper.getSelectRecordIds(grid);
        var exportAll = false;
        if (selections.length === 0) {
            Ext.MessageBox.confirm('??????', '?????????????????????????????????', function (btn) {
                if (btn == 'yes') {
                    exportAll = true;
                    window.location.href = serviceName + '/ConsumeMaterialMgr/exportConsumeData.rdm?exportAll=' + exportAll + '&toExportIds=' + toExportIds + '&consumeTypeId=' + me.consumeTypeId;
                }

            });
        } else {
            window.location.href = serviceName + '/ConsumeMaterialMgr/exportConsumeData.rdm?exportAll=' + exportAll + '&toExportIds=' + toExportIds + '&consumeTypeId=' + me.consumeTypeId;
        }
    }
});