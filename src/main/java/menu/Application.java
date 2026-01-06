package menu;


import menu.controller.Controller;
import menu.service.Service;
import menu.view.InputView;
import menu.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Service service = new Service();
        Controller controller = new Controller(inputView, outputView, service);

        controller.run();
    }
}
