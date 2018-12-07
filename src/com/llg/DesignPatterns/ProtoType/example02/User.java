package com.llg.DesignPatterns.ProtoType.example02;

public class User implements Cloneable{
    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected User clone() {
        User user = null;
        try {
            user = (User) super.clone();
            user.address = this.address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
