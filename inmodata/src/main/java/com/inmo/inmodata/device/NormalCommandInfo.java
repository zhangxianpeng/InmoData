package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;

import java.io.Serializable;

/**
 * @author Jack
 * @date 2022/4/21 15:05
 */
public class NormalCommandInfo extends AbstractInfo implements Serializable {

    private String type;
    private String command;     // 使用一份在线的文档来维护该指令

    public NormalCommandInfo() {
        this.type = getType();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "NormalCommandInfo{" +
                "type='" + type + '\'' +
                ", command='" + command + '\'' +
                '}';
    }
}
