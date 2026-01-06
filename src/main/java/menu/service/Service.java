package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import menu.domain.*;

public class Service {

    public void recommend(Coaches coaches) {
        for (int i = 0; i < 5; i++) {
            Category category = recommendCategory();
            recommendMenu(category, coaches);
        }


    }

    public void recommendMenu(Category category, Coaches coaches) {
        Menus menusByCategory = Menu.getMenusByCategory(category);
        for (Coach coach : coaches) {
            inputMenu(menusByCategory, coach);
        }
    }

    public void inputMenu(Menus menusByCategory, Coach coach){
        Menu menu;
        do {
            menu = Randoms.shuffle(menusByCategory.getMenus()).get(0);
        } while (coach.getMenus().contains(menu));

        coach.getMenus().add(menu);
    }

    public Category recommendCategory() {
        int categoryNumber = Randoms.pickNumberInRange(1, 5);
        return Category.from(categoryNumber);
    }
}
