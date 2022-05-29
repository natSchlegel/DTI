package Entities;

public class BestOfferList {

        public BestOfferList(String petshopName, Double totalPrice, Double distance) {
            this.petshopName = petshopName;
            this.totalPrice = totalPrice;
            this.distance = distance;
        }
        String petshopName;
        Double totalPrice;
        Double distance;

        public String getPetshopName() {
            return petshopName;
        }

        public Double getTotalPrice() {
            return totalPrice;
        }

        public Double getDistance() {
            return distance;
        }

    }
