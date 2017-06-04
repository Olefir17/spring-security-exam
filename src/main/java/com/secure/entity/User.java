package com.secure.entity;

import sun.security.pkcs11.P11Util;

import javax.persistence.Entity;

/**
 * Created by Anastasia on 03.04.2017.
 */
@Entity
public class User {

    private String login;
    private String password;

    public User(){

    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
