package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("default name",500,"ninadpatil1452@gmail.com");
    }
    public VipCustomer(String name, String email){
        this(name , 500,email);
    }
    public VipCustomer(String name, double  creditLimit , String email){
        this.creditLimit = creditLimit;
        this.email= email;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
