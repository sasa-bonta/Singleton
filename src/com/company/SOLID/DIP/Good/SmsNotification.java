package com.company.SOLID.DIP.Good;

public class SmsNotification implements Notificator{

    public SmsNotification() {
    }

    public void sendNotification(String message) {
        System.out.println("Sending notification via SMS ..." + message);
    }
}
