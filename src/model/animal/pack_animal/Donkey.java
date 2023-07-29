package model.animal.pack_animal;

import model.animal.PackAnimal;

import java.util.ArrayList;
import java.util.List;

public class Donkey extends PackAnimal {

    public Donkey(String name, String residence, Boolean shod) {
        super(name, residence, shod);
    }

    @Override
    public String getAnimalType() {
        return "Donkey";
    }
}
