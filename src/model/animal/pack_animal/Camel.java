package model.animal.pack_animal;

import model.animal.PackAnimal;

import java.util.ArrayList;
import java.util.List;

public class Camel extends PackAnimal {

    public Camel(String name, String residence, Boolean shod) {
        super(name, residence, shod);
    }

    @Override
    public String getAnimalType() {
        return "Camel";
    }
}
