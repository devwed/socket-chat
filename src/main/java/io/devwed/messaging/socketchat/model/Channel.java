package io.devwed.messaging.socketchat.model;

import io.devwed.messaging.socketchat.enums.ChannelVisibility;

import java.util.ArrayList;
import java.util.Set;

public class Channel {

    private String name;

    private ArrayList<Message> messages;

    private Set<User> users;

    private ChannelVisibility visibility;

    public Channel() {}

    public Channel(String name, ArrayList<Message> messages, ChannelVisibility visibility, Set<User> users) {
        this.name = name;
        this.messages = messages;
        this.visibility = visibility;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public ChannelVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(ChannelVisibility visibility) {
        this.visibility = visibility;
    }

}
