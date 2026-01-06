package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Coach;
import menu.domain.Coaches;
import menu.domain.Menu;
import menu.utils.Parser;

import java.util.ArrayList;
import java.util.List;

public class View {

    public void readStart(){
        System.out.println("점심 메뉴 추천을 시작합니다.");
    }

    public Coaches readCoach(){
        System.out.println();
        System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");

        List<Coach> coachList = new ArrayList<>();

        List<String> names = Parser.splitComma(Console.readLine());
        for (String name : names) {
            Coach coach = new Coach(name);
            coach.validateName();
            coachList.add(coach);
        }

        Coaches coaches = new Coaches(coachList);
        coaches.validateCoachesCount();

        return coaches;
    }

    public void readCoachesExcludedMenus(Coaches coaches){
        System.out.println();
        for (Coach coach : coaches) {
            System.out.println(coach.name + "(이)가 못 먹는 메뉴를 입력해 주세요.");
            String menusFullName = Console.readLine();
            List<String> menusName = Parser.splitComma(menusFullName);

            for (String menuName : menusName) {
                coach.excludedMenus.add(Menu.from(menuName));
            }
            coach.validateExcludedMenus();
        }
    }
}
