package com.amigoscode.demo.notification;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Notification {
    private String messages;
    private ZonedDateTime timeStamp;

    public Notification(String messages, ZonedDateTime timeStamp) {
        this.messages = messages;
        this.timeStamp = timeStamp;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(ZonedDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Notification() {

    }

    @Override
    public String toString() {
        return "Notification{" +
                "messages='" + messages + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return messages.equals(that.messages) &&
                timeStamp.equals(that.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, timeStamp);
    }
//    abhilash made some changes
}
