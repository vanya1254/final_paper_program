package model.animal.pack_animal;

import model.animal.PackAnimal;


public class Camel extends PackAnimal {

    private String TYPE = "Camel";

    public Camel(String name, String residence, Boolean shod) {
        super(name, residence, shod);
    }

    @Override
    public String getAnimalType() {
        return TYPE;
    }
}
