package com.company;
import java.io.Serializable;

public class Client implements Serializable{
    private Integer id;
    private String full_name;
    private String username;
    private String password;
    private String retype_p;
    private String gender;
    private String phone;
    private String district;


    public Client(){
    }

    public Client(Integer id, String full_name, String username, String password, String retype_p, String gender ,String phone,String district) {
        this.id = id;
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.retype_p = retype_p;
        this.gender = gender;
        this.phone = phone;
        this.district=district;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetype_p() {
        return retype_p;
    }

    public void setRetype_p(String retype_p) {
        this.retype_p = retype_p;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString(){
        return id+" "+full_name+" "+username+" "+password+" "+retype_p+""+gender+"  "+phone+" "+district;
    }
}
