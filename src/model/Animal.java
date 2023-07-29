package model;

public abstract class Animal {
    private String name;
    private String residence;

    public Animal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String toString() {
        return String.format("%s - name: %s,\n\tresidence: %s ", this.getAnimalType(), this.name, this.residence);
    }

    public abstract String getAnimalType();
}
