package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.BleControlData;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

import java.io.Serializable;

/**
 * @author Jack
 * @date 2022/4/13 16:13
 */
@MessageType(type = Dispatcher.CONTROL_COORDINATE_INFO)
public class ControlCoordinateInfo extends AbstractInfo implements Serializable {

    private String type;
    private float x;
    private float y;
    @BleControlData
    private int motion;

    public ControlCoordinateInfo() {
        this.type = getType();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @BleControlData
    public int getMotion() {
        return motion;
    }

    public void setMotion(@BleControlData int motion) {
        this.motion = motion;
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
