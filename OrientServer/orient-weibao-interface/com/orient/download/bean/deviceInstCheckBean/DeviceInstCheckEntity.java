package com.orient.download.bean.deviceInstCheckBean;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class DeviceInstCheckEntity implements Serializable {
    private String systemId;
    private String deviceInstId;
    private String deviceId;
    //终端Id
    private String padId;
    private DeviceInstCheckEventEntity deviceInstCheckEventEntity = null;

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setDeviceInstId(String deviceInstId) {
        this.deviceInstId = deviceInstId;
    }

    public String getDeviceInstId() {
        return deviceInstId;
    }

    public void setDeviceInstCheckEventEntity(DeviceInstCheckEventEntity deviceInstCheckEventEntity) {
        this.deviceInstCheckEventEntity = deviceInstCheckEventEntity;
    }

    public DeviceInstCheckEventEntity getDeviceInstCheckEventEntity() {
        return deviceInstCheckEventEntity;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }


    public void setPadId(String padId) {
        this.padId = padId;
    }

    public String getPadId() {
        return padId;
    }
}
