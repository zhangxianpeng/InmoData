package com.inmo.data.message;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.inmo.data.AbstractInfo;
import com.inmo.data.contacts.ContactsInfo;
import com.inmo.data.device.BatteryInfo;
import com.inmo.data.device.BondedInfo;
import com.inmo.data.device.DateTimeInfo;
import com.inmo.data.device.FileTransferInfo;
import com.inmo.data.navi.BtNaviEndInfo;
import com.inmo.data.navi.BtNaviInfo;
import com.inmo.data.navi.BtNaviVoiceInfo;
import com.inmo.data.notify.NotifyInfo;
import com.inmo.data.weather.WeatherInfo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Message dispatch
 */
public class Dispatcher {
    private static Gson gson = new Gson();
    //绑定消息头
    public static final String BIND_DEVICE_INFO = "bind_device";
    public static final String BIND_BATTERY_INFO = "battery_info";
    public static final String CONTACTS_INFO = "contacts_info";
    public static final String PHONENOTIFY_INFO = "phonenotify_info";
    public static final String NAVI_INFO = "navi_info";
    public static final String NAVI_VOICE_INFO = "navi_voice_info";
    public static final String NAVI_END_INFO = "navi_end_info";
    public static final String NAVI_WEATHER_INFO = "navi_weather_info";
    public static final String DATE_TIME_INFO = "date_time_info";
    public static final String FILE_TRANSFER_INFO = "file_transfer_info";

    //绑定状态
    public static final String BIND_DEVICE_STATE_BINDING = "binding";
    public static final String BIND_DEVICE_STATE_BONDED = "bonded";

    //通讯录相关
    public static final String PHONEBOOK_NAME = "name";//名字
    public static final String PHONEBOOK_NUMBER = "number";//号码
    public static final String PHONEBOOK_NOTE = "note";//备注

    private static Dispatcher instance;

    public static AbstractInfo get(String msg) {
        try {
            JSONObject jo = new JSONObject(msg);
            if (jo.has("type") && !TextUtils.isEmpty(jo.getString("type"))) {
                switch (jo.getString("type")) {
                    case BIND_DEVICE_INFO:
                        return gson.fromJson(msg, BondedInfo.class);
                    case CONTACTS_INFO:
                        return gson.fromJson(msg, ContactsInfo.class);
                    case PHONENOTIFY_INFO:
                        return gson.fromJson(msg, NotifyInfo.class);
                    case NAVI_INFO:
                        return gson.fromJson(msg, BtNaviInfo.class);
                    case NAVI_VOICE_INFO:
                        return gson.fromJson(msg, BtNaviVoiceInfo.class);
                    case NAVI_END_INFO:
                        return gson.fromJson(msg, BtNaviEndInfo.class);
                    case NAVI_WEATHER_INFO:
                        return gson.fromJson(msg, WeatherInfo.class);
                    case BIND_BATTERY_INFO:
                        return gson.fromJson(msg, BatteryInfo.class);
                    case DATE_TIME_INFO:
                        return gson.fromJson(msg, DateTimeInfo.class);
                    case FILE_TRANSFER_INFO:
                        return gson.fromJson(msg, FileTransferInfo.class);
                }
            } else {
                Log.e("Dispatcher", "message must has type field!!");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
