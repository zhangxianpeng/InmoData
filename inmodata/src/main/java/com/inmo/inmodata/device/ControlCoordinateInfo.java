package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

/**
 * @author Jack
 * @date 2022/4/13 16:13
 */
@MessageType(type = Dispatcher.CONTROL_COORDINATE_INFO)
public class ControlCoordinateInfo extends AbstractInfo {

    private String type;
    private int x;
    private int y;

    public ControlCoordinateInfo() {
        this.type = getType();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ControlCoordinateInfo{" +
                "type='" + type + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
