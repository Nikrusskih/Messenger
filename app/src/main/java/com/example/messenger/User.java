package com.example.messenger;

public class User {

    private String id;
    private String name;
    private String lastName;
    private int age;
    private boolean isOnline;

    public User() {
    }

    public User(String id, String name, String lastName, int age, boolean isOnline) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isOnline = isOnline;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isOnline() {
        return isOnline;
    }
}
