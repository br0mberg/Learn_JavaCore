package Enum_2;

public enum FoodType {
    PORRIDGE(true), BREAD(true), SOUP(false), VEGETABLE(true), NUT(true),
    FRUIT(true), DAIRY(false), FISH(false), GREENS(true), MEAT(false), UNKNOWN(false);

    private boolean vegeterian;

    FoodType(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }
}
