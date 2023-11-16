package Collection_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
/ Создать коллекцию и заполнить её случайными целыми числами
/ Удалить повторяющиеся числа
/ Вывести на консоль
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        int initialCapacity = 20;
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(initialCapacity);
        for(int i=0; i < initialCapacity; ++i) {
            arrayList.add(random.nextInt(10));
        }

        Set<Integer> hashSet = new HashSet<>(initialCapacity);
        hashSet.addAll(arrayList);
        System.out.println(arrayList + "\n");
        System.out.println(hashSet  + "\n");

    }
}
