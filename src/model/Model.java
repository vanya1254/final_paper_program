package model;

import model.animal.Pet;
import model.animal.pet.Cat;
import model.animal.pet.Dog;
import model.animal.pet.Hamster;
import presenter.Presenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    private Presenter presenter;
    private Counter counter;
    private List<Animal> animals;
    private List<String> animalTypes;

    public Model(Presenter presenter) {
        this.presenter = presenter;
        this.counter = new Counter();
        this.animals = new ArrayList<>();
        this.animalTypes = Arrays.asList("dog", "cat", "hamster");
    }

    public Counter getCounter() {
        return counter;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<String> getAnimalTypes() {
        return animalTypes;
    }

    public List<String> getAnimalCommands(Animal animal) {
        if (animal instanceof Pet) {
            return ((Pet) animal).getCommands();
        }
        return null;
    }

    public Animal findAnimal(String name) {
        for (Animal animal : this.animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public void addAnimal(String name, String type, String residence, String howUsed) {
        switch (type) {
            case "dog":
                animals.add(new Dog(name, residence, howUsed));
                getCounter().add();
                break;
            case "cat":
                animals.add(new Cat(name, residence, howUsed));
                getCounter().add();
                break;
            case "hamster":
                animals.add(new Hamster(name, residence, howUsed));
                getCounter().add();
                break;
        }
    }

    public Boolean addCommand(String command, String name) {
        for (int i = 0; i < this.animals.size(); i++) {
            if (animals.get(i).getName().equals(name) && animals.get(i) instanceof Pet){
                ((Pet) animals.get(i)).teachCommand(command);
                return true;
            }
        }
        return false;
    }

    public void end() {
        getCounter().close();
    }
}
