package OOP_3;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BouquetFabric bouquet = new BouquetFabric();
        bouquet.addFlower(new Rose(100,
                new Date(2023, 10, 1),
                "purple",
                new Date(2023, 10, 31)));
        bouquet.addFlower(new Сhamomile(150,
                new Date(2023, 10, 2),
                "black",
                new Date(2023, 10, 15)));
        bouquet.addFlower(new Tulip(30,
                new Date(2023, 10, 2),
                "white",
                new Date(2023, 10, 20)));
        // выведем весь букет
        ArrayList<Flower> flowers = bouquet.getBouquet();
        for (Flower flower : flowers) {
            System.out.println(flower.toString() + "\n\n");
        }

        //выведем цвета букета
        System.out.println(bouquet.getBouquetColors()+ "\n\n");

        //выведем стоимость букета
        System.out.println(bouquet.getBouquetCost()+ "\n\n");

        //выведем когда букет завянет
        System.out.println(bouquet.getExpirationDate());
    }
}