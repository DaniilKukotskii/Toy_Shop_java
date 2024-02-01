package view;

import model.Toy;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void showToys(List<Toy> toys) {
        System.out.println("Available Toys:");
        for (Toy toy : toys) {
            System.out.println(toy.getId() + ". " + toy.getName() + " - Quantity: " + toy.getQuantity());
        }
        System.out.println();
    }

    public int promptToySelection() {
        System.out.print("Enter the ID of the toy you want to select: ");
        return scanner.nextInt();
    }

    public void showSelectedToy(Toy toy) {
        System.out.println("Congratulations! You've won a " + toy.getName() + "!");
        System.out.println();
    }
}
