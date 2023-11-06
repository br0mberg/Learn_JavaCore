package Enum_1;

public enum Season {
    WINTER("Новый год", 90), SPRING("День победы", 92), SUMMER("Отпуск", 92), AUTUMN("День России", 91);

    private String description;
    private Integer countOfDays;

    Season(String description, Integer countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCountOfDays() {
        return countOfDays;
    }

    public static Integer getNextSeason(Season season) {
        return (season.ordinal() + 1) % 4;
    }

    public static void printNextSeason(Season season) {
        int key = getNextSeason(season);
        switch (key) {
            case 0:
                System.out.println(Season.WINTER.name());
                break;
            case 1:
                System.out.println(Season.SPRING.name());
                break;
            case 2:
                System.out.println(Season.SUMMER.name());
                break;
            case 3:
                System.out.println(Season.AUTUMN.name());
                break;
        }
    }
}
