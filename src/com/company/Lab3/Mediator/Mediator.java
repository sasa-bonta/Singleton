package com.company.Lab3.Mediator;

import java.util.*;

public class Mediator implements IMediator {

    private List<IUser> users;

    public Mediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void Register(IUser user) {
        users.add(user);
    }

    @Override
    public void SendMessage(IUser user, String message) {
        for (IUser currentUser: users) {
            if (currentUser != user) {
                currentUser.ReceiveMessage(message);
            }
        }
    }
}
