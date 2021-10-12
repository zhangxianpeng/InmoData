package com.inmo.inmodata.navi;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

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
