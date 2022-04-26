package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

import java.io.Serializable;

/**
 * @author Jack
 * @date 2022/4/21 15:05
 */
@MessageType(type = Dispatcher.BITMAP_VALUE_INFO)
public class BitmapValueInfo extends AbstractInfo implements Serializable {

    private String type;
    private String bitMapValue;

    public BitmapValueInfo() {
        this.type = getType();
    }

    public String getBitMapValue() {
        return bitMapValue;
    }

    public void setBitMapValue(String bitMapValue) {
        this.bitMapValue = bitMapValue;
    }

    @Override
    public String toString() {
        return "BITMAP_VALUE_INFO{" +
                "type='" + type + '\'' +
                ", bitMapValue='" + bitMapValue + '\'' +
                '}';
    }
}
