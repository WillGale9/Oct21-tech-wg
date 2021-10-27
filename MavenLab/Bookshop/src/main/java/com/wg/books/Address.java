package com.wg.books;

public class Address {
    private int num;
    private String street;
    private String city;
    private String county;
    private String postcode;

    public Address(int num,String street,String city,String county,String postcode) {
        super();
        this.num = num;
        this.street = street;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
    }

//    getter and setter
    public int getNumber(){
        return num;
    }
    public void setNumber(int num){
        this.num = num;
    }

    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getCounty(){
        return county;
    }
    public void setCounty(String county){
        this.county = county;
    }

    public String getPostcode(){
        return postcode;
    }
    public void setPostcode(String postcode){
        this.postcode = postcode;
    }

    }


