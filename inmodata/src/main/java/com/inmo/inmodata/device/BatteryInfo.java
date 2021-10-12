package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.BIND_BATTERY_INFO)
public class BatteryInfo extends AbstractInfo {
    private String type;
    private String battery;

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public BatteryInfo() {
        type = getType();
    }

    @Override
    public String toString() {
        return "BatteryInfo{" +
                "type='" + type + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }

}
