package p03_CarShopExtended.modelsimpl;

import p03_CarShopExtended.models.Sellable;

public class Seat extends BaseCar implements Sellable {

    private Double price;

    public Seat() {
    }

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double
            price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(String.format("This is %s produced in %s and have %d tires",
                        this.getModel(), this.getCountryProduced(), TYRES));
        return sb.toString();
    }


}
