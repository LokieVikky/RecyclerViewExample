package com.example.recyclerviewexample;

public class User {
    String userId;
    String mobileNum;

    public User(String userId, String mobileNum) {
        this.userId = userId;
        this.mobileNum = mobileNum;
    }

    public String getUserId() {
        return userId;
    }

    public String getMobileNum() {
        return mobileNum;
    }
}
