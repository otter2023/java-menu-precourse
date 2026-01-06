package menu.domain;

public enum Category {
    JAPANESE(1, "일식"),
    KOREAN(2, "한식"),
    CHINESE(3, "중식"),
    ASIAN(4, "아시안"),
    WESTERN(5, "양식");

    private final int number;
    private final String koreanName;

    Category(int number, String koreanName) {
        this.number = number;
        this.koreanName = koreanName;
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

    @Override
    public String toString() {
        return "| " + koreanName+ " ";
    }
}
