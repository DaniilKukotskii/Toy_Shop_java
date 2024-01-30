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

}
