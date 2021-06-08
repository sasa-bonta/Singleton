package com.company.SOLID.DIP.Good;

public class Broadcast {

    private Notificator notificator;

    public Broadcast(Notificator notificator) {
        this.notificator = notificator;
    }

    public void sendNotification() {
        this.notificator.sendNotification("wake up!");
    }
}
