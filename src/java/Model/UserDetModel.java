/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bia
 */
public class UserDetModel {
    
    private String fullname, username, nickname, email, phoneNum, pack, bday;
    private String consul_time, consul_date, consul_via, consul_doctor, payment;

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }
    
    public String getConsul_time() {
        return consul_time;
    }

    public void setConsul_time(String consul_time) {
        this.consul_time = consul_time;
    }

    public String getConsul_date() {
        return consul_date;
    }

    public void setConsul_date(String consul_date) {
        this.consul_date = consul_date;
    }

    public String getConsul_via() {
        return consul_via;
    }

    public void setConsul_via(String consul_via) {
        this.consul_via = consul_via;
    }

    public String getConsul_doctor() {
        return consul_doctor;
    }

    public void setConsul_doctor(String consul_doctor) {
        this.consul_doctor = consul_doctor;
    }
}
