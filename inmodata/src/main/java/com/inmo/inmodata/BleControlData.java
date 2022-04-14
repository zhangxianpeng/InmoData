package com.inmo.inmodata;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Jack
 * @date 2022/4/14 10:00
 */
@IntDef({
        BleControlData.BLE_SCROLL, BleControlData.BLE_SCROLL_DOWN, BleControlData.BLE_SCROLL_UP
})
@Retention(RetentionPolicy.CLASS)
public @interface BleControlData {

    int BLE_SCROLL = 0x11;
    int BLE_SCROLL_DOWN = 0x12;
    int BLE_SCROLL_UP = 0x13;

}
