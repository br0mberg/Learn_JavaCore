package Enum_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Время года, ассоциация, количество дней");
        for(Season season: Season.values()) {
            System.out.println(season.name() + " " + season.getDescription() + " " + season.getCountOfDays());
        }

        System.out.println("\nВведите текущее время года: \n" +
            " 0 - зима\n"  + " 1 - весна\n" + " 2 - лето\n"  + " 3 - осень\n\n");

        Scanner scanner = new Scanner(System.in);
        int seasonNow = scanner.nextInt();
        switch (seasonNow) {
            case 0:
                Season.printNextSeason(Season.WINTER);
                break;
            case 1:
                Season.printNextSeason(Season.SPRING);
                break;
            case 2:
                Season.printNextSeason(Season.SUMMER);
                break;
            case 3:
                Season.printNextSeason(Season.AUTUMN);
                break;
            default:
                System.out.println("Нет такого времени года");
        }
    }
}
