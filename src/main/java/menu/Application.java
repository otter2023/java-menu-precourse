package menu;


import menu.controller.Controller;
import menu.service.Service;
import menu.view.View;

public class Application {
    public static void main(String[] args) {
        View inputView = new View();
        Service service = new Service();
        Controller controller = new Controller(inputView, service);

        controller.run();
    }
}
