package presenter;

import model.Toy;
import model.ToyStore;
import view.ConsoleView;

public class ToyPresenter {
    private ToyStore toyStore;
    private ConsoleView consoleView;

    public ToyPresenter(ToyStore toyStore, ConsoleView consoleView) {
        this.toyStore = toyStore;
        this.consoleView = consoleView;
    }

    public void start() {
        while (true) {
            consoleView.showToys(toyStore.getToys());
            int selectedToyId = consoleView.promptToySelection();

            Toy selectedToy = toyStore.getRandomToy();
            if (selectedToy != null) {
                toyStore.decreaseToyQuantity(selectedToyId);
                consoleView.showSelectedToy(selectedToy);
            } else {
                System.out.println("Error: Something went wrong while selecting a toy.");
            }
        }
    }
}
