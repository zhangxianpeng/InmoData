package com.inmo.inmodata.navi;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.NAVI_VOICE_INFO)
public class BtNaviVoiceInfo extends AbstractInfo {
    private String voiceInfo;
    private String type;

    public BtNaviVoiceInfo() {
        type = getType();
    }

    public String getVoiceInfo() {
        return voiceInfo;
    }

    public void setVoiceInfo(String voiceInfo) {
        this.voiceInfo = voiceInfo;
    }

    @Override
    public String toString() {
        return "NotifyInfo{" +
                "type='" + type + '\'' +
                ", voiceInfo='" + voiceInfo + '\'' +
                '}';
    }
}
