package com.inmo.inmodata.device;

import static com.inmo.inmodata.message.Dispatcher.CALENDER_EVENT_INFO;

import com.google.gson.annotations.SerializedName;
import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;

import java.util.List;

/**
 * @author Jack
 * @date 2022/2/28 14:14
 */
@MessageType(type = CALENDER_EVENT_INFO)
public class CalenderEventInfo extends AbstractInfo {
    private String type;

    @SerializedName("calenderEvents")
    private List<CalenderEvents> mCalenderEvents;

    public CalenderEventInfo(List<CalenderEvents> calenderEvents) {
        this.type = getType();
        mCalenderEvents = calenderEvents;
    }

    public List<CalenderEvents> getCalenderEvents() {
        return mCalenderEvents;
    }

    public void setCalenderEvents(List<CalenderEvents> calenderEvents) {
        mCalenderEvents = calenderEvents;
    }

    @Override
    public String toString() {
        return "CalenderEventInfo{" +
                "type='" + type + '\'' +
                ", mCalenderEvents=" + mCalenderEvents +
                '}';
    }
}
