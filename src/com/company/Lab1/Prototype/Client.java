package com.company.Lab1.Prototype;

public class Client {

    String email;
    String password;

    public Client(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "\n Client{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
