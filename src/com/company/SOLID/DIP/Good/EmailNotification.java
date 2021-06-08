package com.company.SOLID.DIP.Good;

public class EmailNotification implements Notificator {

    public EmailNotification() {
    }

    public void sendNotification(String message) {
        System.out.println("Sending notification via email ..." + message);
    }
}
