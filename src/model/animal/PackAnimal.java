package model.animal;

import model.Animal;

public abstract class PackAnimal extends Animal {
    private Boolean shod;

    public PackAnimal(String name, String residence, Boolean shod) {
        super(name, residence);
        this.shod = shod;
    }

    public void shoe() {
        this.shod = true;
    }

    public Boolean getShod() {
        return this.shod;
    }
}
