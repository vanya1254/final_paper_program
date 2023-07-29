package view;

import model.Animal;
import presenter.Presenter;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;
import static jdk.internal.net.http.common.Utils.close;

public class Console extends View {
    private Presenter presenter;
    private Scanner scanner;
    private static final String COMMAND_NAME = "Enter animal name: ";
    private static final String COMMAND_TYPE = "Enter animal type (Dog/Cat/Hamster): ";
    private static final String COMMAND_RESIDENCE = "Enter animal residence: ";
    private static final String COMMAND_HOW_USED = "Enter animal how used: ";
    private static final String COMMAND_COMMAND = "Enter new command to teach: ";
    private static final String COMMAND_ADD = "New command added.";
    private static final String COMMAND_ERROR_NAME = "Pet not found.";
    private static final String COMMAND_MESSAGE = "Enter command: ";
    private static final String COMMAND_ERROR = "Invalid Command. Try again.";
    private static final String COMMAND_ERROR_TYPE = "Invalid animal type.";

    public Console(Presenter presenter) {
        this.presenter = presenter;
        this.scanner = new Scanner(System.in);
    }

    private void showMenu() {
        System.out.println("\nAvailable commands:");
        System.out.println("1. Add new animal");
        System.out.println("2. List all animals");
        System.out.println("3. Show animal commands");
        System.out.println("4. Teach new command to an animal");
        System.out.println("Type 'exit' to quit the program.");
    }

    private String scanCommand() {
        System.out.println(COMMAND_MESSAGE);
        String command = scanner.nextLine();
        return command;
    }

    public void menu(String command) {
        switch(command) {
            case "1" -> addNewAnimal();
            case "2" -> listAllAnimal();
            case "3" -> showAnimalCommands();
            case "4" -> teachCommandToAnimal();
            case "exit" -> end();
            default -> System.out.println(COMMAND_ERROR);
        }
    }

    @Override
    public void start() {
        String command;
        while (true) {
            showMenu();
            command = scanCommand();
            menu(command);
        }
    }

    private void addNewAnimal() {
        System.out.println(COMMAND_NAME);
        String name = scanner.nextLine();
        System.out.println(COMMAND_TYPE);
        String type = scanner.nextLine().toLowerCase();
        System.out.println(COMMAND_RESIDENCE);
        String residence = scanner.nextLine();
        System.out.println(COMMAND_HOW_USED);
        String howUsed = scanner.nextLine();

        if (checkType(type)) {
            this.presenter.add(name, type, residence, howUsed);
        } else {
            System.out.println(COMMAND_ERROR_TYPE);
        }
    }

    private boolean checkType(String type) {
        for (String standard : this.presenter.listTypes()) {
            if (standard.equals(type)) {
                return true;
            }
        }
        return false;
    }

    private void listAllAnimal() {
        for (Animal animal : this.presenter.list()) {
            System.out.printf("%s - %s\n", animal.getAnimalType(), animal.getName());
        }
    }

    private void showAnimalCommands() {
        System.out.println(COMMAND_NAME);
        String name = scanner.nextLine();
        Animal animal = searchAnimal(name);
        List<String> commands = null;
        if (animal != null) {
            commands = this.presenter.commands(animal);
        }

        if (commands != null) {
            System.out.printf("\n%s - %s:", animal.getAnimalType(), animal.getName());
            for (String command : commands) {
                System.out.printf("\t- %s", command);
            }
        }
    }

    private Animal searchAnimal(String name) {
        Animal animal = this.presenter.search(name);
        return animal;
    }

    private void teachCommandToAnimal() {
        System.out.println(COMMAND_NAME);
        String name = scanner.nextLine();
        System.out.println(COMMAND_COMMAND);
        String command = scanner.nextLine();

        if (this.presenter.teach(command, name)) {
            System.out.println(COMMAND_ADD);
        } else {
            System.out.println(COMMAND_ERROR_NAME);
        }
    }

    private void end() {
        this.scanner.close();
        this.presenter.end();
        exit(0);
    }
}
