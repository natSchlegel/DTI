package Entities;

public class PetShop {
    private String name;
    private Double distance;
    private Double smallPetsPrice;
    private Double bigPetsPrice;
    private Double weekendSmallPetsPrice;
    private Double weekendBigPetsPrice;

    public PetShop(String name, Double distance, Double smallPetsPrice, Double bigPetsPrice, Double weekendSmallPetsPrice, Double weekendBigPetsPrice) {
        this.name = name;
        this.distance = distance;
        this.smallPetsPrice = smallPetsPrice;
        this.bigPetsPrice = bigPetsPrice;
        this.weekendSmallPetsPrice = weekendSmallPetsPrice;
        this.weekendBigPetsPrice = weekendBigPetsPrice;
    }

    public String getName() {
        return name;
    }

    public Double getSmallPetsPrice() {
        return smallPetsPrice;
    }

    public Double getBigPetsPrice() {
        return bigPetsPrice;
    }

    public Double getWeekendSmallPetsPrice() {
        return weekendSmallPetsPrice;
    }

    public Double getWeekendBigPetsPrice() {
        return weekendBigPetsPrice;
    }

    public Double getDistance() {
        return distance;
    }
}
