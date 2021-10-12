package com.inmo.inmodata.device;


import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

@MessageType(type = Dispatcher.BIND_DEVICE_INFO)
public class BondedInfo extends AbstractInfo {
    private String type;
    private DeviceInfo local;
    private DeviceInfo remote;
    private String state;

    public BondedInfo(DeviceInfo local, DeviceInfo remote) {
        this.local = local;
        this.remote = remote;
        type = getType();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DeviceInfo getLocal() {
        return local;
    }

    public void setLocal(DeviceInfo local) {
        this.local = local;
    }

    public DeviceInfo getRemote() {
        return remote;
    }

    public void setRemote(DeviceInfo remote) {
        this.remote = remote;
    }

    @Override
    public String toString() {
        return "BondedInfo{" +
                "type='" + type + '\'' +
                ", localName='" + local != null ?(local.getName() != null ? local.getName():""):"" + '\'' +
                ", localAddress='" +local != null ?(local.getAddress() != null ? local.getAddress():""):"" + '\'' +
                ", remoteName='" + remote != null ?(remote.getName() != null ? remote.getName():""):"" + '\'' +
                ", remoteAddress='" + remote != null ?(remote.getAddress() != null ? remote.getAddress():""):"" + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public static class DeviceInfo {
        private String name;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
