package presenter;

import model.Animal;
import model.Model;
import view.Console;
import view.View;

import java.util.List;

public class Presenter {
    private Model model;
    private View view;

    public Presenter() {
        this.model = new Model(this);
        this.view = new Console(this);
    }

    public List<String> listTypes() {
        return this.model.getAnimalTypes();
    }

    public void add(String name, String type, String residence, String howUsed) {
        this.model.addAnimal(name, type, residence, howUsed);
    }

    public List<Animal> list() {
        return this.model.getAnimals();
    }

    public void start(){
        this.view.start();
    }

    public void end(){
        this.model.end();
    }
}