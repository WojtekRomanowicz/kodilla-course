package com.kodillagoodpatterns.challenges;

public class Client {
    private String name;
    private  String surname;
    private  String country;
    private  String town;
    private  String address;
    private  String phoneNumber;
    private  String email;

    public Client(String name, String surname, String country, String town, String address,
                    String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.town = town;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public Client() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public String getTown() {
        return town;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client info: " +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", country: '" + country + '\'' +
                ", town: '" + town + '\'' +
                ", address: '" + address + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", email:'" + email + '\'' ;
    }
}
