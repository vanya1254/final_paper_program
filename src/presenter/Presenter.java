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

    public List<Animal> list() {
        return this.model.getAnimals();
    }

    public List<String> commands(String name) {
        return this.model.getAnimalCommands(name);
    }

    public void add(String name, String type, String residence, String howUsed) {
        this.model.addAnimal(name, type, residence, howUsed);
    }

    public Boolean teach(String command, String name) {
        return this.model.addCommand(command, name);
    }

    public Integer counter() {
        return this.model.getCount();
    }

    public void start(){
        this.view.start();
    }

    public void end(){
        this.model.end();
    }
}