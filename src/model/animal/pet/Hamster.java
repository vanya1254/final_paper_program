package model.animal.pet;

import model.animal.Pet;

import java.util.ArrayList;
import java.util.List;

public class Hamster extends Pet {
    private List<String> commands;

    public Hamster(String name, String residence, String howUsed) {
        super(name, residence, howUsed);
        commands = new ArrayList<>();
    }

    @Override
    public String getAnimalType() {
        return "Hamster";
    }

    @Override
    public void showCommands() {
        System.out.println(getName() + " knows the following commands: ");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

    @Override
    public void teachCommand(String command) {
        commands.add(command);
    }
}
