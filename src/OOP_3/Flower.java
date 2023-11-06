package OOP_3;

import java.util.Date;

public abstract class Flower {
    private Integer cost;
    private Date dateOfRecieve;
    private String color;
    private Date expirationDate;

    public Flower(Integer cost, Date dateOfRecieve, String color, Date expirationDate) {
        this.cost = cost;
        this.dateOfRecieve = dateOfRecieve;
        this.color = color;
        this.expirationDate = expirationDate;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getDateOfRecieve() {
        return dateOfRecieve;
    }

    public void setDateOfRecieve(Date dateOfRecieve) {
        this.dateOfRecieve = dateOfRecieve;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Цветок: " + this.getClass().getSimpleName() +
                "\nЦена: " + this.getCost() +
                "\nЦвет: " + this.getColor() +
                "\nДата поступления: " + this.getDateOfRecieve().toString() +
                "\nГоден до: " + this.getExpirationDate().toString();
    }
}
