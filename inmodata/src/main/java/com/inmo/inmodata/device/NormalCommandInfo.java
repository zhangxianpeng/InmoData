package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

import java.io.Serializable;

/**
 * @author Jack
 * @date 2022/4/21 15:05
 */
@MessageType(type = Dispatcher.NORMAL_COMMAND_INFO)
public class NormalCommandInfo extends AbstractInfo implements Serializable {

    private String type;
    private String command;     // 使用一份在线的文档来维护该指令
    private String value;

    public NormalCommandInfo() {
        this.type = getType();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NormalCommandInfo{" +
                "type='" + type + '\'' +
                ", command='" + command + '\'' +
                '}';
    }
}
