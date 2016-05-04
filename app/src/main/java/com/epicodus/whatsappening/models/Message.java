package com.epicodus.whatsappening.models;

import org.parceler.Parcel;

/**
 * Created by Guest on 5/4/16.
 */
@Parcel
public class Message {
    public String body;
    public String sender;
    public String getter;
    public String id;

    public Message() {}

    public Message(String body, String sender, String getter) {
        this.body = body;
        this.sender = sender;
        this.getter = getter;
    }

    public String getGetter() {
        return getter;
    }

    public String getBody() {
        return body;
    }

    public String getSender() {
        return sender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}