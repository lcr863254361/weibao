/**
 * Created by Seraph on 16/7/6.
 */
Ext.define('OrientTdm.DestroyRepairTemplateMgr.model.DestroyTaskTreeNodeModel', {
    extend: 'Ext.data.Model',
    fields: [
        'id',
        'dataId',
        'text',
        'modelName',
        'modelId',
        'status'
    ],
    proxy: {
        type: 'ajax',
        api: {
            "read": serviceName + "/destroyRepairMgr/getDestroyNextLayerNodes.rdm"
        },
        reader: {
            type: 'json',
            successProperty: 'success',
            totalProperty: 'totalProperty',
            root: 'results',
            messageProperty: 'msg'
        }
    }
});