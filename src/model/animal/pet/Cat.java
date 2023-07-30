package model.animal.pet;

import model.animal.Pet;


public class Cat extends Pet {
    private String TYPE = "Cat";
    public Cat(String name, String residence, String howUsed) {
        super(name, residence, howUsed);
    }

    @Override
    public String getAnimalType() {
        return TYPE;
    }
}
