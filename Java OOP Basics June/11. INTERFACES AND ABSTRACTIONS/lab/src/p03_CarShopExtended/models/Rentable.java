package p03_CarShopExtended.models;

public interface Rentable extends Car {

    Integer getMinRentDay();
    Double getPricePerDay();
}
