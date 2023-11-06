package Enum_2;

public class Delish {

    public boolean isVegeterian(Food[] foods) {
        boolean isVegeterian = true;
        for(Food food: foods) {
            isVegeterian = food.getFoodType().isVegeterian();
        }
        return isVegeterian;
    }
}
