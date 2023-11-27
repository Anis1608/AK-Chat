package com.example.akchat.model;

import com.google.firebase.Timestamp;

import java.util.List;

public class ChatroomModel{

    String chatroomId;
    List<String> userIds;
    Timestamp lastmessageTimestamp;
    String lastmessageSenderId;
    String lastmessage;


    public ChatroomModel() {
    }

    public ChatroomModel(String chatroomId, List<String> userIds, Timestamp lastmessageTimestamp, String lastmessageSenderId) {
        this.chatroomId = chatroomId;
        this.userIds = userIds;
        this.lastmessageTimestamp = lastmessageTimestamp;
        this.lastmessageSenderId = lastmessageSenderId;
    }

    public String getChatroomId() {
        return chatroomId;
    }

    public void setChatroomId(String chatroomId) {
        this.chatroomId = chatroomId;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public Timestamp getLastmessageTimestamp() {
        return lastmessageTimestamp;
    }

    public void setLastmessageTimestamp(Timestamp lastmessageTimestamp) {
        this.lastmessageTimestamp = lastmessageTimestamp;
    }

    public String getLastmessageSenderId() {
        return lastmessageSenderId;
    }

    public void setLastmessageSenderId(String lastmessageSenderId) {
        this.lastmessageSenderId = lastmessageSenderId;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }
}
