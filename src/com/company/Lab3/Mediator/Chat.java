package com.company.Lab3.Mediator;

// https://medium.com/@jmeza/mediator-design-pattern-7cc9ee5891d1

public class Chat {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        IUser vasile = new User(mediator, "Vasile");
        IUser albert = new User(mediator, "Albert");
        IUser nostradamus = new User(mediator, "Nostradamus");

        mediator.Register(vasile);
        mediator.Register(albert);
        mediator.Register(nostradamus);

        vasile.SendMessage("Good morning!");
        albert.SendMessage("Welcome!");
        nostradamus.SendMessage("Have a nice day!");
    }
}
