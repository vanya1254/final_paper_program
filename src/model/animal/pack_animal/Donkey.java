package model.animal.pack_animal;

import model.animal.PackAnimal;


public class Donkey extends PackAnimal {

    private String TYPE = "Donkey";

    public Donkey(String name, String residence, Boolean shod) {
        super(name, residence, shod);
    }

    @Override
    public String getAnimalType() {
        return TYPE;
    }
}
