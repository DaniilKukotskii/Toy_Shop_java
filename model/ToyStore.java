package model;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore() {
        this.toys = new ArrayList<>();
        initializeToys(); 
    }

    private void initializeToys() {
        addToy(new Toy(1, "Doll", 10, 20.0));
        addToy(new Toy(2, "Car", 8, 15.0));
        addToy(new Toy(3, "Robot", 5, 25.0));
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(newWeight);
                break;
            }
        }
    }

    public Toy getRandomToy() {
        double random = Math.random() * 100;
        double cumulativeWeight = 0;

        for (Toy toy : toys) {
            cumulativeWeight += toy.getWeight();
            if (random <= cumulativeWeight) {
                return toy;
            }
        }

        return null;  
    }

    public void decreaseToyQuantity(int toyId) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                int currentQuantity = toy.getQuantity();
                if (currentQuantity > 0) {
                    toy.setQuantity(currentQuantity - 1);
                }
                break;
            }
        }
    }

    public List<Toy> getToys() {
        return toys;
    }
}
