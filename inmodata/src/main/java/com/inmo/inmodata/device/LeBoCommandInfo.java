package com.inmo.inmodata.device;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.LEBO_CAST_COMMAND)
public class LeBoCommandInfo extends AbstractInfo {
    private String type;
    private String command;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public LeBoCommandInfo() {
        type = getType();
    }

}