package model.animal.pack_animal;


import model.animal.PackAnimal;


public class Horse extends PackAnimal {

    private String TYPE = "Horse";

    public Horse(String name, String residence, Boolean shod) {
        super(name, residence, shod);
    }

    @Override
    public String getAnimalType() {
        return TYPE;
    }
}
