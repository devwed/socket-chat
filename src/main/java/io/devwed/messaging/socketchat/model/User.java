package io.devwed.messaging.socketchat.model;

import java.util.Date;
import java.util.Set;

public class User {

    private String username;

    private String email;

    private Date joinDate;

    private Set<Channel> channelMembership;

    public User() {}

    public User(String username, String email, Date joinDate, Set<Channel> channelMembership) {
        this.username = username;
        this.email = email;
        this.joinDate = joinDate;
        this.channelMembership = channelMembership;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Set<Channel> getChannelMembership() {
        return channelMembership;
    }

    public void setChannelMembership(Set<Channel> channelMembership) {
        this.channelMembership = channelMembership;
    }

}
