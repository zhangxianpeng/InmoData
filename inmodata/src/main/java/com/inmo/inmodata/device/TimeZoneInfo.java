package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

import java.io.Serializable;

/**
 * @author Jack
 * @date 2022/4/21 15:05
 */
@MessageType(type = Dispatcher.TIME_ZONE_INFO)
public class TimeZoneInfo extends AbstractInfo implements Serializable {

    private String type;
    private String command;
    private String date;
    private String time;
    private String timeZone;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "TIME_ZONE_INFO{" +
                "type='" + type + '\'' +
                ", command='" + command + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }
}
