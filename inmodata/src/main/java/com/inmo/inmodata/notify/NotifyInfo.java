package com.inmo.inmodata.notify;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.PHONENOTIFY_INFO)
public class NotifyInfo extends AbstractInfo {
    private String time;
    private String type;
    private String packageName;
    private String title;
    private String content;
    private String labelName;
    private Drawable icon;

    public String getLabelName() {
        return labelName;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public NotifyInfo() {
        type = getType();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NotifyInfo{" +
                "time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", packageName='" + packageName + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
