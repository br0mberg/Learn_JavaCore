package Generics_2;

import java.util.ArrayList;

public class NumberContainer <T extends Number> {
    private ArrayList<T> numbersArray = new ArrayList<>();

    public NumberContainer(ArrayList<T> numbersArray) {
        this.numbersArray = numbersArray;
    }

    public NumberContainer() {
        this.numbersArray = new ArrayList<>();
    }

    public void addNumber(T number) {
        this.numbersArray.add(number);
    }

    public void printNumberOnIndex(int index) {
        try {
            System.out.println("Получаем элемент на позиции: " + index +
                    " типа: " + numbersArray.getFirst().getClass() +
                    " результат: "+ this.numbersArray.get(index) + "\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
