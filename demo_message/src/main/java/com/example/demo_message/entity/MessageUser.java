package com.example.demo_message.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MessageUser {
    private int id;
    private String name;
    private String email;
    private String phone;

    public MessageUser() {
    }

    public MessageUser(String email, int id, String name, String phone) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonGetter("fullname")
    public String getName() {
        return name;
    }

    @JsonSetter("fullname")
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MessageUser {" +
                "email: '" + email + '\'' +
                ", id:" + id +
                ", name:'" + name + '\'' +
                ", phone:'" + phone + '\'' +
                '}';
    }
}
