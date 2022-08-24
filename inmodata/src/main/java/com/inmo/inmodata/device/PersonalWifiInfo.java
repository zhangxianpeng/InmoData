package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

import java.io.Serializable;

/**
 * @author Administrator
 */
@MessageType(type = Dispatcher.PERSONAL_WIFI_INFO)
public class PersonalWifiInfo extends AbstractInfo implements Serializable {

    private String type;
    private String ssid;
    private String pwd;
    private String fileNumber;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public PersonalWifiInfo() {
        type = getType();
    }

    @Override
    public String toString() {
        return "PersonalWifiInfo{" +
                "type='" + type + '\'' +
                ", ssid='" + ssid + '\'' +
                ", pwd='" + pwd + '\'' +
                ", fileNumber='" + fileNumber + '\'' +
                '}';
    }
}
