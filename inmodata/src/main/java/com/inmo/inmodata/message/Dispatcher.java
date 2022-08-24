package com.inmo.inmodata.message;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.contacts.ContactsInfo;
import com.inmo.inmodata.device.BatteryInfo;
import com.inmo.inmodata.device.BitmapValueInfo;
import com.inmo.inmodata.device.BondedInfo;
import com.inmo.inmodata.device.BrightnessInfo;
import com.inmo.inmodata.device.CalenderEventInfo;
import com.inmo.inmodata.device.ControlCoordinateInfo;
import com.inmo.inmodata.device.DateTimeInfo;
import com.inmo.inmodata.device.FileTransferInfo;
import com.inmo.inmodata.device.LeBoCommandInfo;
import com.inmo.inmodata.device.NormalCommandInfo;
import com.inmo.inmodata.device.PersonalWifiInfo;
import com.inmo.inmodata.device.TimeZoneInfo;
import com.inmo.inmodata.device.VolumeInfo;
import com.inmo.inmodata.device.WifiSSIDInfo;
import com.inmo.inmodata.navi.BtNaviEndInfo;
import com.inmo.inmodata.navi.BtNaviInfo;
import com.inmo.inmodata.navi.BtNaviVoiceInfo;
import com.inmo.inmodata.navi.IMNaviInfo;
import com.inmo.inmodata.net.HttpInfo;
import com.inmo.inmodata.notify.NotifyInfo;
import com.inmo.inmodata.weather.WeatherInfo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Message dispatch
 */
public class Dispatcher {
    private static Gson gson = new Gson();
    // 绑定消息头
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
    public static final String WIFI_DIRECT_INFO = "device_wifi_direct_info";
    public static final String CALENDER_EVENT_INFO = "calender_event_info";
    public static final String BRIGHTNESS_INFO = "brightness_info";
    public static final String VOLUME_INFO = "volume_info";
    public static final String CONTROL_COORDINATE_INFO = "control_coordinate_info";
    public static final String NORMAL_COMMAND_INFO = "normal_command_info";
    public static final String BITMAP_VALUE_INFO = "bitmap_value_info";
    public static final String TIME_ZONE_INFO = "time_zone_info";
    public static final String PERSONAL_WIFI_INFO = "personal_wifi_info";
    public static final String NAVI_INFO_IM = "navi_info_im";
    public static final String HTTP_INFO = "http_info";

    public static final String LEBO_CAST_COMMAND = "lebo_cast_command";
    public static final String WIFI_SSID = "wifi_ssid";

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
                    case CALENDER_EVENT_INFO:
                        return gson.fromJson(msg, CalenderEventInfo.class);
                    case BRIGHTNESS_INFO:
                        return gson.fromJson(msg, BrightnessInfo.class);
                    case VOLUME_INFO:
                        return gson.fromJson(msg, VolumeInfo.class);
                    case LEBO_CAST_COMMAND:
                        return gson.fromJson(msg, LeBoCommandInfo.class);
                    case WIFI_SSID:
                        return gson.fromJson(msg, WifiSSIDInfo.class);
                    case CONTROL_COORDINATE_INFO:
                        return gson.fromJson(msg, ControlCoordinateInfo.class);
                    case NORMAL_COMMAND_INFO:
                        return gson.fromJson(msg, NormalCommandInfo.class);
                    case BITMAP_VALUE_INFO:
                        return gson.fromJson(msg, BitmapValueInfo.class);
                    case TIME_ZONE_INFO:
                        return gson.fromJson(msg, TimeZoneInfo.class);
                    case NAVI_INFO_IM:
                        return gson.fromJson(msg, IMNaviInfo.class);
                    case PERSONAL_WIFI_INFO:
                        return gson.fromJson(msg, PersonalWifiInfo.class);
                    case HTTP_INFO:
                        return gson.fromJson(msg, HttpInfo.class);
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
