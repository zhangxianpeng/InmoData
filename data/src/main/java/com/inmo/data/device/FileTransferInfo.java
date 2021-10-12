package com.inmo.data.device;

import com.inmo.data.AbstractInfo;
import com.inmo.data.MessageType;
import com.inmo.data.message.Dispatcher;

@MessageType(type = Dispatcher.FILE_TRANSFER_INFO)
public class FileTransferInfo extends AbstractInfo {
    private String type;
    private String instruction;
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
