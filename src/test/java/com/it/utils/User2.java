package com.it.utils;

import java.util.Objects;

public class User2 {
    private String login;
    private String password;
    private String email;

    public User2(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User2{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user2 = (User2) o;
        return Objects.equals(login, user2.login) &&
                Objects.equals(password, user2.password) &&
                Objects.equals(email, user2.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password, email);
    }
}

