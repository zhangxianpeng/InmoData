package com.inmo.data.navi;

import com.inmo.data.AbstractInfo;
import com.inmo.data.MessageType;
import com.inmo.data.message.Dispatcher;

@MessageType(type = Dispatcher.NAVI_END_INFO)
public class BtNaviEndInfo extends AbstractInfo {
    private String NaviStatus;
    private String type;

    public BtNaviEndInfo() {
        type = getType();
    }
    public String getNaviStatus() {
        return NaviStatus;
    }

    public void setNaviStatus(String naviStatus) {
        NaviStatus = naviStatus;
    }
}
