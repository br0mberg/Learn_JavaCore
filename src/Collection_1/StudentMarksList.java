package Collection_1;

import java.util.*;

/*
/ Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
/ Удалить неудовлетворительные оценки из списка.
/ Выведите на консоль коллекцию.
/ Найти самую высокую оценку с использованием итератора.
/ Выведите на консоль оценку.
 */
public class StudentMarksList {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            marks.add(random.nextInt(5) + 1);
        }

        Iterator<Integer> iterator = marks.iterator();
        System.out.print(marks + "\n");
        Integer highMark = 0;

        while (iterator.hasNext()) {
            int markNow = iterator.next();
            if(markNow <= 3) {
                iterator.remove();
            }
            if (markNow > highMark) highMark = markNow;
        }

        System.out.print(marks + "\n");
        System.out.println(highMark);
    }
}
