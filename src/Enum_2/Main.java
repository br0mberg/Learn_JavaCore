package Enum_2;

public class Main {
    public static void main(String[] args) {
        Delish delish = new Delish();

        Food[] foods = new Food[]{new Potato(), new Cod(), new Beef()};

        Food[] foods2 = new Food[]{new Potato(), new Potato(), new Potato()};

        System.out.println(foods.toString());
        System.out.print(delish.isVegeterian(foods) + "\n");

        System.out.println(foods2.toString());
        System.out.print(delish.isVegeterian(foods2) + "\n");
    }
}
