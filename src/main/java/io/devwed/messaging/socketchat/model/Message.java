package io.devwed.messaging.socketchat.model;

import java.util.Date;

public class Message {

    private String content;

    private Date sent;

    private Channel channel;

    private User user;

    public Message () {
    }

    public Message(String content, Date sent, Channel channel, User user) {
        this.content = content;
        this.sent = sent;
        this.channel = channel;
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}
