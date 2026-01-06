package menu.domain;

import java.util.Objects;

public enum Menu {
    GYUDON("규동", Category.JAPANESE),
    UDON("우동", Category.JAPANESE),
    MISO_SIRU("미소시루", Category.JAPANESE),
    SUSHI("스시", Category.JAPANESE),
    KATSU_DONG("가츠동", Category.JAPANESE),
    ONIGIRI("오니기리", Category.JAPANESE),
    HIGH_RICE("하이라이스", Category.JAPANESE),
    RAMEN("라멘", Category.JAPANESE),
    OKONOMIYAKI("오코노미야끼", Category.JAPANESE),

    GIMBAP("김밥", Category.KOREAN),
    KIMCHI_STEW("김치찌개", Category.KOREAN),
    SSAMBAP("쌈밥", Category.KOREAN),
    SOYBEAN_PASTE_STEW("된장찌개", Category.KOREAN),
    BIBIMBAP("비빔밥", Category.KOREAN),
    KALGUKSU("칼국수", Category.KOREAN),
    BULGOGI("불고기", Category.KOREAN),
    TTEOKBOKKI("떡볶이", Category.KOREAN),
    STIR_FRIED_SPICY_PORK("제육볶음", Category.KOREAN),

    KKANPUNGGI("깐풍기", Category.CHINESE),
    STIR_FRIED_NOODLES("볶음면", Category.CHINESE),
    DONGPAE_MEAT("동파육", Category.CHINESE),
    JAJANGMYEON("짜장면", Category.CHINESE),
    JJAMPPONG("짬뽕", Category.CHINESE),
    MAPA_TOFU("마파두부", Category.CHINESE),
    SWEET_AND_SOUR_PORK("탕수육", Category.CHINESE),
    TOMATO_STIR_FRIED_EGGS("토마토 달걀볶음", Category.CHINESE),
    RED_PEPPER_JAPCHAE("고추잡채", Category.CHINESE),

    PAD_THAI("팟타이", Category.ASIAN),
    KAO_PAD("카오 팟", Category.ASIAN),
    NASI_GORENG("나시고렝", Category.ASIAN),
    PINEAPPLE_FRIED_RICE("파인애플 볶음밥", Category.ASIAN),
    PHO("쌀국수", Category.ASIAN),
    TOM_YUM_KUNG("똠얌꿍", Category.ASIAN),
    BANH_MI("반미", Category.ASIAN),
    VIETNAMESE_SPRING_ROLLS("월남쌈", Category.ASIAN),
    BUNCHA("분짜", Category.ASIAN),

    LASAGNA("라자냐", Category.WESTERN),
    GRATIN("그라탱", Category.WESTERN),
    GNOCCHI("뇨끼", Category.WESTERN),
    QUICHE("끼슈", Category.WESTERN),
    FRENCH_TOAST("프렌치 토스트", Category.WESTERN),
    BAGUETTE("바게트", Category.WESTERN),
    SPAGHETTI("스파게티", Category.WESTERN),
    PIZZA("피자", Category.WESTERN),
    PANINI("파니니", Category.WESTERN);

    private final Category category;
    private final String koreanName;

    Menu(String koreanName, Category category) {
        this.category = category;
        this.koreanName = koreanName;
    }

    public static Menu from(String inputName) {
        for (Menu menu : Menu.values()){
            if (menu.koreanName.equals((inputName))){
                return menu;
            }
            if (Objects.equals(inputName, "") || Objects.equals(inputName, " ")){
                return null;
            }
        }

        throw new IllegalArgumentException("[ERROR] 존재하지 않는 메뉴입니다. 다시 입력해 주세요.");
    }

    public static Menus getMenusByCategory(Category category) {
        Menus menus = new Menus();
        for (Menu menu : Menu.values()) {
            if (menu.category == category) {
                menus.add(menu);
            }
        }
        return menus;
    }
    public Category getCategory() {
        return category;
    }

    public String getKoreanName() {
        return koreanName;
    }

    @Override
    public String toString() {
        return "| " + koreanName + " ";
    }


}
