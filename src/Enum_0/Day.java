package Enum_0;

public enum Day {
    MONDAY(0), TUSDAY(1),
    WEDNESDAY(3), THURDAY(4),
    FRIDAY(5), SATURDAY(0),
    SUNDAY(0);

    private int normOfWorkHours;

    Day(int normOfWorkHours) {
        this.normOfWorkHours = normOfWorkHours;
    }

    public int getNormOfWorkHours() {
        return normOfWorkHours;
    }
}
