package model.animal.pet;

import model.animal.Pet;


public class Dog extends Pet {
    private String TYPE = "Dog";

    public Dog(String name, String residence, String howUsed) {
        super(name, residence, howUsed);
    }

    @Override
    public String getAnimalType() {
        return TYPE;
    }
}
