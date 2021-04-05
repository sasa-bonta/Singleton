package com.company.Lab3.Command;

public class HeatingOnCommand implements Command {

    private HeatingSystem heatingSystem;

    public HeatingOnCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.heatOn();
    }
}