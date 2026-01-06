package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import menu.domain.*;


public class Service {

    public Categories recommend(Coaches coaches) {
        Categories categories = new Categories();

        for (int i = 0; i < 5; i++) {
            Category newCategory = recommendCategory();

            int count = checkCategoryCount(categories, newCategory);
            while (count > 2) {
                newCategory = recommendCategory();
                count = checkCategoryCount(categories, newCategory);
            }

            categories.add(newCategory);
            recommendMenu(newCategory, coaches);
        }

        return categories;
    }

    public int checkCategoryCount(Categories categories, Category newCategory){
        int count = 0;
        for (Category category : categories) {
            if (category.equals(newCategory)) {
                count++;
            }
        }
        return count;
    }


    public void recommendMenu(Category category, Coaches coaches) {
        Menus menusByCategory = Menu.getMenusByCategory(category);
        for (Coach coach : coaches) {
            inputMenu(menusByCategory, coach);
        }
    }

    public void inputMenu(Menus menusByCategory, Coach coach) {
        Menu menu;
        do {
            String menuName = Randoms.shuffle(menusByCategory.getMenuNames()).get(0);
            menu = Menu.from(menuName);
        } while (coach.getMenus().contains(menu));

        coach.getMenus().add(menu);
    }

    public Category recommendCategory() {
        int categoryNumber = Randoms.pickNumberInRange(1, 5);
        return Category.from(categoryNumber);
    }
}
