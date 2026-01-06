package menu.controller;

import menu.domain.Categories;
import menu.domain.Coaches;
import menu.service.Service;
import menu.view.InputView;
import menu.view.OutputView;

public class Controller {

    private final Service service;
    private final InputView inputView;
    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView, Service service) {
        this.service = service;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        readStart();
        Coaches coaches = readCoach();
        readCoachesExcludedMenus(coaches);

        Categories categories = service.recommend(coaches);

        outputView.printStart();
        outputView.printCategoriesResult(categories);
        outputView.printMenuResult(coaches);
        outputView.printEnd();
    }

    private void readCoachesExcludedMenus(Coaches coaches) {
        while (true) {
            try {
                inputView.readCoachesExcludedMenus(coaches);
                return;
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void readStart() {
        while (true) {
            try {
                inputView.readStart();
                return;
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Coaches readCoach() {
        while (true) {
            try {
                return inputView.readCoach();
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
