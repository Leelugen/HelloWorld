package com.llg.DesignPatterns.ProtoType.example02;

public class Address implements Cloneable {
    public String city;
    public String district;
    public String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    protected Address clone(){
        Address address = null;
        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
