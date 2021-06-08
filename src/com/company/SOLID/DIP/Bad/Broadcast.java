package com.company.SOLID.DIP.Bad;

public class Broadcast {

    private SmsNotification smsNotification;

    public Broadcast() {
        this.smsNotification = new SmsNotification();
    }

    public void sendNotification() {
        this.smsNotification.sendNotification("wake up!");
    }
}
