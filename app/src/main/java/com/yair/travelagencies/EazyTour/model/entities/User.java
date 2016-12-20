package com.yair.travelagencies.EazyTour.model.entities;

/**
 * Created by Yair on 12/12/2016.
 */

public class User
{
    protected long userId;
    protected String userName;
    protected String password;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
