package menu.domain;

public class Coach {
    private final String name;

    private final Menus excludedMenus;
    private Menus menus;

    public Coach(String name) {
        this.name = name;
        excludedMenus = null;
        menus = null;
    }

    public void validateName() {
        if (name.length() < 2 || name.length() > 4) {
            throw new IllegalArgumentException("[ERROR] 코치 이름은 최소 2글자, 최대 4글자입니다.");
        }
    }

    public void validateExcludedMenus() {
        if (excludedMenus.size() > 2) {
            throw new IllegalArgumentException("[ERROR] 먹지 못하는 메뉴의 개수는 2개 이하입니다.");
        }
    }

    public String getName() {
        return name;
    }

    public Menus getExcludedMenus() {
        return excludedMenus;
    }

    public Menus getMenus() {
        return menus;
    }

}
