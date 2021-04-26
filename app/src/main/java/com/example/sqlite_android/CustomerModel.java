package com.example.sqlite_android;

public class CustomerModel {

    /**
     * Setup steps:
     * 1. Make fields
     * 2. Define/generate constructor. Optionally define parameterless constructor
     * 3. Generate getters and setters
     * 4. Generate toString; may shorten later.
     */

    // First, make the fields.
    private int id
    private String name;
    private int age;
    private boolean isActive;

    // Second thing to do, make constructor.
    // Constructors

    public CustomerModel(int id, String name, int age, boolean isActive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    // Sometimes applications require non-parameterized constructor; dunno if we need, but can reference
    public CustomerModel() {
    }

    // toString is necessary for printing the contents of a class object

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }


    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
