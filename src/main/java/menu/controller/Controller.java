package menu.controller;

import menu.domain.Coaches;
import menu.service.Service;
import menu.view.View;

public class Controller {

    private final Service service;
    private final View view;

    public Controller(View view, Service service) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        view.readStart();
        Coaches coaches = view.readCoach();
        view.readCoachesExcludedMenus(coaches);

        service.recommend();
    }
}
