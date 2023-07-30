package model.animal.pet;

import model.animal.Pet;

public class Hamster extends Pet {
    private String TYPE = "Hamster";

    public Hamster(String name, String residence, String howUsed) {
        super(name, residence, howUsed);
    }

    @Override
    public String getAnimalType() {
        return TYPE;
    }
}
