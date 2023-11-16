package Map_1;

public class Toy {
    private String name;
    private Integer price;
    private Integer ageLimit;

    public Toy(String name, Integer price, Integer ageLimit) {
        this.name = name;
        this.price = price;
        this.ageLimit = ageLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }
}
