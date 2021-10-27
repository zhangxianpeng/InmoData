package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.FILE_TRANSFER_INFO)
public class FileTransferInfo extends AbstractInfo {
    private String type;
    private String instruction;

    /**
     * 手机端随机创建的热点名称
     */
    private String SSID;
    /**
     * 手机端随机创建的热点密码
     */
    private String PWD;

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public FileTransferInfo() {
        type = getType();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        return "FileTransferInfo{" +
                "type='" + type + '\'' +
                '}';
    }
}
