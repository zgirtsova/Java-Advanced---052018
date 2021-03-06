package p02_CarShop;

public class Seat implements Car {

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;


    public Seat() {
    }

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    public void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
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
