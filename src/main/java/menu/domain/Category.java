package menu.domain;

public enum Category {
    JAPANESE(1),
    KOREAN(2),
    CHINESE(3),
    ASIAN(4),
    WESTERN(5);

    private final int number;

    Category(int number) {
        this.number = number;
    }

    public static Category from(int number) {
        for (Category category : Category.values()){
            if (category.number == number){
                return category;
            }
        }

        throw new IllegalArgumentException("[ERROR] 존재하지 않는 카테고리 번호입니다. 다시 입력해 주세요.");
    }


    public int getNumber() {
        return number;
    }
}
