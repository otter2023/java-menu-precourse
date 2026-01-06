package menu.view;

import menu.domain.*;

public class OutputView {

    public void printStart() {
        System.out.println("메뉴 추천 결과입니다.");
        System.out.println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
    }

    public void printCategoriesResult(Categories categories) {
        System.out.print("[ 카테고리 ");
        for (Category category : categories) {
            System.out.print(category);
        }
        System.out.println("]");
    }

    public void printMenuResult(Coaches coaches){
        for (Coach coach : coaches) {
            System.out.print("[ " + coach.getName() + " ");
            for (Menu menu : coach.getMenus()) {
                System.out.print(menu);
            }
            System.out.println("]");
        }
    }

    public void printEnd(){
        System.out.println();
        System.out.println("추천을 완료했습니다.");
    }
}
