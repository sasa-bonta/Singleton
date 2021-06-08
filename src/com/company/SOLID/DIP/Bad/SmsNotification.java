package com.company.SOLID.DIP.Bad;

public class SmsNotification {

    public SmsNotification() {
    }

    public void sendNotification(String message) {
        System.out.println("Sending notification via SMS ..." + message);
    }
}
