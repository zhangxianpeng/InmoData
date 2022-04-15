package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.WIFI_SSID)
public class WifiSSIDInfo extends AbstractInfo {
    private String type;
    private String ssid;
    private boolean isApOpen = false;

    private String pwd;
    private String content;
    private String contentType;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

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