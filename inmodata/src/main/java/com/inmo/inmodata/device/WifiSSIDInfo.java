package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.WIFI_SSID)
public class WifiSSIDInfo extends AbstractInfo {
    private String type;
    private String ssid;
    private boolean isApOpen = false;

    public boolean isApOpen() {
        return isApOpen;
    }

    public void setApOpen(boolean apOpen) {
        isApOpen = apOpen;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public WifiSSIDInfo() {
        type = getType();
    }

}