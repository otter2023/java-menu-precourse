package menu.domain;

public enum Category {
    JAPANESE(1),
    KOREAN(2),
    CHINESE(3),
    ASIAN(4),
    WESTERN(5);

    public final int number;

    Category(int number) {
        this.number = number;
    }
}
