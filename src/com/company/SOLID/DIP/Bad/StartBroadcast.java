package com.company.SOLID.DIP.Bad;

public class StartBroadcast {

    public static void main(String[] args) {
        Broadcast broadcast = new Broadcast();
        broadcast.sendNotification();
    }
}
