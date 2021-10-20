package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.WIFI_DIRECT_INFO)
public class WifiDirectInfo extends AbstractInfo {
    private String type;
    private String deviceName;
    private String deviceMacAddress;

    public WifiDirectInfo() {
        type = getType();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceMacAddress() {
        return deviceMacAddress;
    }

    public void setDeviceMacAddress(String deviceMacAddress) {
        this.deviceMacAddress = deviceMacAddress;
    }

    @Override
    public String toString() {
        return "WifiDirectInfo{" +
                "type='" + type + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceMacAddress='" + deviceMacAddress + '\'' +
                '}';
    }

}
