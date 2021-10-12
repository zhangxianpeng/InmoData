package com.inmo.inmodata.contacts;

import static com.inmo.inmodata.message.Dispatcher.CONTACTS_INFO;

import com.google.gson.annotations.SerializedName;
import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;

import java.util.List;

@MessageType(type = CONTACTS_INFO)
public class ContactsInfo extends AbstractInfo {
    private String type;

    @SerializedName("contacts")
    private List<Contacts> contacts;

    public ContactsInfo(List<Contacts> contacts) {
        this.contacts = contacts;
        type = getType();
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "ContactsInfo{" +
                "type='" + type + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
