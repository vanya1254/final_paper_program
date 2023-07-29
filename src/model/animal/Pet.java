package model.animal;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet extends Animal {
    private String howUsed;
    private List<String> commands;

    public Pet(String name, String residence, String howUsed) {
        super(name, residence);
        this.howUsed = howUsed;
        this.commands = new ArrayList<>();
    }

    public String getHowUsed() {
        return howUsed;
    }

    public void setHowUsed(String howUsed) {
        this.howUsed = howUsed;
    }

    public List<String> getCommands() {
        return this.commands;
    }

    public void teachCommand(String command) {
        this.commands.add(command);
    }
}
