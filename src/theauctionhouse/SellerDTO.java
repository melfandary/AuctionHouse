package theauctionhouse;

import java.util.ArrayList;

public class SellerDTO{
    private int ID;
    private String name;
    private String pass;
    private String mail;
    private int age;
    private String Gender;
    private String address;
    private int number;

//Contructors

    
        public SellerDTO() {
    }

    public SellerDTO(int ID, String name, String pass, String mail, int age, String Gender, String address, int number) {
        this.ID = ID;
        this.name = name;
        this.pass = pass;
        this.mail = mail;
        this.age = age;
        this.Gender = Gender;
        this.address = address;
        this.number = number;
    }

// setters and getters 

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
   



}