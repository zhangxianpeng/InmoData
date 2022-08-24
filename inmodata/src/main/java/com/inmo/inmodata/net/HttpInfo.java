package com.inmo.inmodata.net;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.HTTP_INFO)
public class HttpInfo extends AbstractInfo {
    private String type;
    private String ipAddres;
    private String port;

    public HttpInfo() {
        type = getType();
    }

    public String getIpAddres() {
        return ipAddres;
    }

    public void setIpAddres(String ipAddres) {
        this.ipAddres = ipAddres;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "HttpInfo{" +
                "type='" + type + '\'' +
                ", ipAddres='" + ipAddres + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
