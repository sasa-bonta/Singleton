package com.company.Lab3.Command;

public class HeatingOffCommand implements Command {

    private HeatingSystem heatingSystem;

    public HeatingOffCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.heatOff();
    }
}
