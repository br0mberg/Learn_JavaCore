package Map_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
/ Класс Toy
/ HashMap содержащий пары ключ - имя игрушки, значение - объект игрушки.
/ Перебрать и распечатать пары значений.
/ Перебрать и распечатать набор из имен продуктов.
/ Перебрать и распечатать значения продуктов.
 */
public class ToyMap {
    public static void main(String[] args) {
        int initialCapacity = 10;
        Map<String, Toy> toyMap = new HashMap<>();

        Toy policeCar = new Toy("Police Car", 200, 6);
        Toy medicineCar = new Toy("Medicine Car", 100, 6);

        Toy barbieDoll = new Toy("Barbie Doll", 500, 3);
        Toy tank = new Toy("Russian tank", 1000, 9);

        toyMap.put(policeCar.getName(), policeCar);
        toyMap.put(medicineCar.getName(), medicineCar);

        toyMap.put(barbieDoll.getName(), barbieDoll);
        toyMap.put(tank.getName(), tank);

        for (Map.Entry<String, Toy> toys : toyMap.entrySet()) {
            System.out.println("Name: " + toys.getKey() + " Object: " + toys.getValue());
        }

        System.out.println("\n");

        for (String names : toyMap.keySet()) {
            System.out.println("Name: " + names + " ");
        }
        System.out.println("\n");
        for (Toy toy: toyMap.values()) {
            System.out.println(toy);
        }
    }
}
