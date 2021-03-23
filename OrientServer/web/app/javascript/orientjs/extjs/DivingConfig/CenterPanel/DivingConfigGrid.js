/**
 * Created by User on 2019/1/9.
 */
Ext.define('OrientTdm.DivingConfig.CenterPanel.DivingConfigGrid', {
    extend: 'OrientTdm.Common.Extend.Panel.OrientPanel',
    alias: 'widget.divingConfigGrid',
    config: {
        schemaId: TDM_SERVER_CONFIG.WEI_BAO_SCHEMA_ID,
        templateName: TDM_SERVER_CONFIG.TPL_DIVING_CONFIG,
        modelName: TDM_SERVER_CONFIG.DIVING_CONFIG
    },

    initComponent: function () {
        var me = this;
        var modelId = OrientExtUtil.ModelHelper.getModelId(me.modelName, me.schemaId);
        var templateId = OrientExtUtil.ModelHelper.getTemplateId(modelId, me.templateName);
        var modelGrid = Ext.create('OrientTdm.Common.Extend.Grid.OrientModelGrid', {
            region: 'center',
            modelId: modelId,
            isView: 0,
            templateId: templateId
        });

        Ext.apply(me, {
            layout: 'border',
            items: [modelGrid],
            modelGrid: modelGrid
        });
        me.callParent(arguments);
    }
});