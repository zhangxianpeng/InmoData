package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.BRIGHTNESS_INFO)
public class BrightnessInfo extends AbstractInfo {
    private String type;
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BrightnessInfo() {
        type = getType();
    }

}
