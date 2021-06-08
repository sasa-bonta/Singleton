package com.company.SOLID.DIP.Bad;

public class EmailNotification {

    public EmailNotification() {
    }

    public void sendNotification(String message) {
        System.out.println("Sending notification via email ..." + message);
    }
}
