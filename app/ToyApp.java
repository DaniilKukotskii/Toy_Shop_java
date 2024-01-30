package app;

import model.ToyStore;
import presenter.ToyPresenter;
import view.ConsoleView;

public class ToyApp {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        ConsoleView consoleView = new ConsoleView();
        ToyPresenter toyPresenter = new ToyPresenter(toyStore, consoleView);

        toyPresenter.start();
    }
}
