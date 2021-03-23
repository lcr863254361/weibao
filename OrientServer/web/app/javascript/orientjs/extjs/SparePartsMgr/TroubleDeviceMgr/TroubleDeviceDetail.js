/**
 * Created by User on 2019/4/4.
 */
Ext.define('OrientTdm.SparePartsMgr.TroubleDeviceMgr.TroubleDeviceDetail', {
    extend: 'OrientTdm.Common.Extend.Form.OrientForm',
    alias: 'widget.troubleDeviceDetail',
    config: {
        //url: serviceName + '/spareParts/getImageUrl.rdm',
        modelId: null,
        dataId: null
    },
    statics: {
        showPictures: function (cellId) {
            var me = this;
            //me.imageUrl=serviceName + '/spareParts/getImageUrl.rdm';
            if (!Ext.isEmpty(cellId)) {
                var filePanel = {
                    layout: 'fit',
                    html: '<iframe id="imageViewFrame" width="100%" height="100%" marginwidth="0" framespacing="0" marginheight="0" frameborder="0" src = ""></iframe>',
                    listeners: {
                        render: function () {
                            me.reconfigImagePlugin(cellId);
                        }
                    }
                };
                OrientExtUtil.WindowHelper.createWindow(filePanel, {
                    title: '图片查看',
                    iconCls: 'icon-picture',
                    height: 0.8 * globalHeight,
                    width: 0.8 * globalWidth,
                    maximized: true,
                    buttons: [{
                        text: '关闭',
                        iconCls: 'icon-close',
                        handler: function () {
                            this.up('window').close();
                        }
                    }],
                    buttonAlign: 'center'
                });
                //var schemaId = TDM_SERVER_CONFIG.WEI_BAO_SCHEMA_ID;
                //var modelId = OrientExtUtil.ModelHelper.getModelId("T_TROUBLE_DEVICE_INS", schemaId);
                //me.imageUrl = me.imageUrl + '?modelId=' + modelId + '&dataId=' + cellId;
            }
        },
        reconfigImagePlugin: function (cellId) {
            var schemaId = TDM_SERVER_CONFIG.WEI_BAO_SCHEMA_ID;
            var modelId = OrientExtUtil.ModelHelper.getModelId("T_TROUBLE_DEVICE_INS", schemaId);
            Ext.query("#imageViewFrame")[0].src = serviceName + '/app/views/file/localPicturePreview.jsp?' + 'modelId=' + modelId + '&dataId=' + cellId + '&fileGroupId=-4';
        },

     //   playVoice: function () {
            //var soundManager=new SoundManager();
            //soundManager.debugMode=false;
            //soundManager.url='voiceFileForTDevice';
            //soundManager.beginDelayedInit();
            //soundManager.onload=function(){
            //    soundManager.createSound({
            //        id:'voice',
            //        url:'1554186571953_1554186340024temp.mp3',
            //        autoPlay:true
            //    })
            //};
            //soundManager.play('voice');
      //  }
    },
    initComponent: function () {
        var me = this;

        var schemaId = TDM_SERVER_CONFIG.WEI_BAO_SCHEMA_ID;
        var modelId = OrientExtUtil.ModelHelper.getModelId("T_TROUBLE_DEVICE_INS", schemaId);

        OrientExtUtil.AjaxHelper.doRequest(serviceName + '/spareParts/getTroubleDeviceDetail.rdm', {
            troubleId: me.troubleId
        }, false, function (resp) {
            console.log(resp.decodedData.detailContent);
            me.detailContent = resp.decodedData.results.detailContent;
            me.url = resp.decodedData.results.voiceUrl;
        });


        Ext.apply(this, {
            items: [
                {
                    xtype: 'panel',
                    layout: 'hbox',
                    bodyStyle: 'border-width:0 0 0 0; background:transparent',
                    combineErrors: true,
                    defaults: {
                        flex: 1
                    },
                    layoutConfig: {
                        pack: "start",
                        align: "stretch"
                    },
                    listeners: {
                        mouseover: function () {
                            $(".image_stack").delegate('img', 'mouseenter', function () { //when user hover mouse on image with div id=stackphotos
                                if ($(this).hasClass('stackphotos')) { //
                                    var $parent = $(this).parent();
                                    $parent.find('img#midPhoto').addClass('rotateLeft');
                                    $parent.find('img#topPhoto').addClass('rotateMid');
                                    $parent.find('img#bottomPhoto').css("left", "90px"); // reposition the first and last image
                                    $parent.find('img#midPhoto').css("left", "30px");
                                }
                            }).delegate('img', 'mouseleave', function () { // when user removes cursor from the image stack
                                $('img#bottomPhoto').removeClass('rotateRight'); // remove the css class that was previously added to make it to its original position
                                $('img#midPhoto').removeClass('rotateLeft');
                                $('img#topPhoto').removeClass('rotateMid');
                                $('img#bottomPhoto').css("left", ""); // remove the css property 'left' value from the dom
                                $('img#midPhoto').css("left", "");
                            });
                        },
                    },
                    items: [{
                        xtype: 'fieldcontainer',
                        cls: 'x-form-textfield-noborder',
                        layout: 'anchor',
                        combineErrors: true,
                        defaults: {
                            flex: 1,
                            anchor: '95%'
                        },
                        layoutConfig: {
                            pack: "start",
                            align: "stretch"
                        },
                        items: [
                            //    {
                            //    fieldLabel: '深度',
                            //    xtype: 'displayfield',
                            //    labelAlign: 'right',
                            //    name: 'depth',
                            //    //margin: '9 5 5 0',
                            //    padding:'30 5 5 0',
                            //    readOnly:true,
                            //    value: me.depth,
                            //    cls:'x-form-textfield-noborder'
                            //},
                            {
                                fieldLabel: '语音记录',
                                xtype: 'displayfield',
                                labelAlign: 'right',
                                name: 'voice',
                                //margin: '9 5 5 0',
                                padding: '30 5 5 0',
                                cls: 'x-form-textfield-noborder',
                                //value : '<div class="image_stack" onclick="OrientTdm.CurrentTaskMgr.WaterDownDetail.playVoice(\'\')">' +
                                value: '<div>' +
                                '<audio src=' +me.url+ '\ controls width="48px" height="50px"></audio>' +
                                '</div>'
                            }, {
                                fieldLabel: '多媒体记录',
                                xtype: 'displayfield',
                                labelAlign: 'right',
                                name: 'media',
                                //margin: '9 5 5 0',
                                padding: '30 5 5 0',
                                readOnly: true,
                                cls: 'x-form-textfield-noborder',

                                value: '<div class="image_stack" onclick="OrientTdm.SparePartsMgr.TroubleDeviceMgr.TroubleDeviceDetail.showPictures(\'' + me.troubleId + '\')">' +
                                //value: '<div class="image_stack" <a href="'+serviceName + '/app/views/file/imageViewByFancybox.jsp?modelId=' + modelId + '&dataId=' + me.troubleId + '&fileGroupId=-4"'+'></a>'+'>' +
                                '<img id="bottomPhoto" class="stackphotos" src="app/images/rotate/bottom.jpg">' +
                                '<img id="midPhoto" class="stackphotos" src="app/images/rotate/mid.jpg">' +
                                '<img id="topPhoto" class="stackphotos" src="app/images/rotate/top.jpg">' +
                                '</div>'

                            }, {
                                name: 'detail',
                                xtype: 'textarea',
                                fieldLabel: '详细说明',
                                labelAlign: 'right',
                                //margin: '9 5 5 0',
                                padding: '30 5 5 0',
                                grow: true,
                                //labelWidth: 50,
                                height: 200,
                                readOnly: true,
                                value: me.detailContent
                            }]
                    }]
                }],
            buttonAlign: 'center',
            buttons: [
                {
                    text: '关闭',
                    iconCls: 'icon-close',
                    handler: function () {
                        this.up('window').close();
                    }
                }
            ]
        });
        this.callParent(arguments);
    }
    //)}

});