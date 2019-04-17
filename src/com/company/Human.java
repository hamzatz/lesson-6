package com.company;

public class Human {
    private String firstName;
    private int age;
    private boolean isWoman;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean woman) {
        isWoman = woman;
    }

    public Human(String firstName, int age, boolean isWoman) {
        this.firstName = firstName;
        this.age = age;
        this.isWoman = isWoman;


    }
}
