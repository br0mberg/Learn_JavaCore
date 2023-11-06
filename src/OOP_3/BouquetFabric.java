package OOP_3;

import java.util.ArrayList;
import java.util.Date;

public class BouquetFabric {
    private ArrayList<Flower> bouquet;
    public BouquetFabric() {
        this.bouquet = new ArrayList<>();
    }

    public Integer calculateCost(){
        Integer cost = 0;
        for (Flower flower : bouquet) {
            cost += flower.getCost();
        }

        return cost;
    }

    public String getBouquetColors() {
        String colors = "";
        for(int i = 0; i < bouquet.size(); ++i) {
            colors += " " + bouquet.get(i).getColor();
        }
        return colors;
    }

    public Integer getBouquetCost() {
        Integer cost = 0;
        for(Flower flower : bouquet) {
            cost += flower.getCost();
        }
        return cost;
    }

    public Date getExpirationDate() {
        Date expirationDateBouquet = new Date(0);
        for(Flower flower : bouquet) {
            Date expirationDateFlower = flower.getExpirationDate();
            if (flower.getExpirationDate().after(expirationDateBouquet)) {
                expirationDateBouquet = expirationDateFlower;
            }
        }
        return expirationDateBouquet;
    }

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(ArrayList<Flower> bouquet) {
        this.bouquet = bouquet;
    }

    public void addFlower(Flower flower) {
        this.bouquet.add(flower);
    }
}
