package Enum_0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pair<Day, Integer>> workingHoursInDay = new ArrayList<>();
        workingHoursInDay.add(new Pair<>(Day.MONDAY, 8));
        workingHoursInDay.add(new Pair<>(Day.TUSDAY, 8));
        workingHoursInDay.add(new Pair<>(Day.WEDNESDAY, 8));
        workingHoursInDay.add(new Pair<>(Day.THURDAY, 8));
        workingHoursInDay.add(new Pair<>(Day.FRIDAY, 8));

        for(Pair<Day, Integer> day : workingHoursInDay) {
            System.out.println("День недели: " + day.getKey()
                    + " Норма часов: " + day.getKey().getNormOfWorkHours()
                    + " Отработано по факту: " + String.valueOf(day.getValue()) + "\n");
        }
    }
}
