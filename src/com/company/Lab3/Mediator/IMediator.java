package com.company.Lab3.Mediator;

public interface IMediator {
    void Register(IUser user);
    void SendMessage(IUser user, String message);
}
