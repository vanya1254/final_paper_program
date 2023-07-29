package model.animal.pet;

import model.animal.Pet;

import java.util.List;

public class Dog extends Pet {

    public Dog(String name, String residence, String howUsed, List<String> commands) {
        super(name, residence, howUsed, commands);
    }

    @Override
    public String getAnimalType() {
        return "Dog";
    }
}
