package com.company.Lab3.Mediator;

public class User implements IUser {
    private String name;
    private IMediator mediator;

    public User(IMediator mediator, String name) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void SendMessage(String message) {
        mediator.SendMessage(this, message);
    }

    @Override
    public void ReceiveMessage(String message) {
        System.out.println(name + " received " + message);
    }
}
