package com.inmo.inmodata.device;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Jack
 * @date 2022/2/25 10:55
 */
public class CalenderEvents implements Serializable {

    String eventTitle;
    String eventContent;
    long startTime;
    long createTime;
    int color;

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalenderEvents)) return false;
        CalenderEvents that = (CalenderEvents) o;
        return getStartTime() == that.getStartTime() && getEventTitle().equals(that.getEventTitle()) && getEventContent().equals(that.getEventContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventTitle(), getEventContent(), getStartTime());
    }

    @Override
    public String toString() {
        return "CalenderEventBean{" +
                "eventTitle='" + eventTitle + '\'' +
                ", eventContent='" + eventContent + '\'' +
                ", startTime=" + startTime +
                ", createTime=" + createTime +
                ", color=" + color +
                '}';
    }
}
