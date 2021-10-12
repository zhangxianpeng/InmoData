package com.inmo.data.navi;

import com.inmo.data.AbstractInfo;
import com.inmo.data.MessageType;
import com.inmo.data.message.Dispatcher;

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
