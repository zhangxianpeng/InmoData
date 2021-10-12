package com.inmo.data.contacts;

import static com.inmo.data.message.Dispatcher.CONTACTS_INFO;

import com.google.gson.annotations.SerializedName;
import com.inmo.data.AbstractInfo;
import com.inmo.data.MessageType;

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
