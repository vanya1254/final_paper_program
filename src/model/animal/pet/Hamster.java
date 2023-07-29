package model.animal.pet;

import model.animal.Pet;

import java.util.List;

public class Hamster extends Pet {

    public Hamster(String name, String residence, String howUsed, List<String> commands) {
        super(name, residence, howUsed, commands);
    }

    @Override
    public String getAnimalType() {
        return "Hamster";
    }
}
