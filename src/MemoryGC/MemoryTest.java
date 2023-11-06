package MemoryGC;

import java.util.ArrayList;

/*
 * -Xms - начальный размер кучи
 * -Xmx - максимальный размер кучи
 * -Xss - размер стека потоков
 * –XX:HeapDumpOnOutOfMemory - создаст файл дампа кучи, когда эта ошибка произойдет в следующий раз.
 * -verbose:gc - чтобы получить вывод процесса сборки мусора
 * */
public class MemoryTest {

    public static void main(String[] args) {
        printMemory();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 15_000_000; i++) {
            list.add(new Man(i));
        }

        printMemory();
    }

    public static void printMemory() {
        System.out.println("Max mem: " + Runtime.getRuntime().maxMemory() / 1000000);
        System.out.println("Total mem: " + Runtime.getRuntime().totalMemory() / 1000000);
        System.out.println("Free available mem: " + Runtime.getRuntime().freeMemory() / 1000000);
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used mem: " + usedMemory / 1000000);
        long freeMemory = Runtime.getRuntime().maxMemory() - usedMemory;
        System.out.println("Free mem: " + freeMemory / 1000000);
        System.out.println("------------------------------------------");
    }

}