package com.company.SOLID.DIP.Good;

public class StartBroadcast {

    public static void main(String[] args) {
        SmsNotification smsNotification = new SmsNotification();
        EmailNotification emailNotification = new EmailNotification();

        Broadcast broadcast = new Broadcast(emailNotification);
        broadcast.sendNotification();
    }
}
