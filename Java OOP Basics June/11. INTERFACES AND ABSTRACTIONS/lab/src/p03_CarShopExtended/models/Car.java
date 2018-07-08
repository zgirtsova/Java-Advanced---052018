package p03_CarShopExtended.models;

public interface Car {

    public static final int TYRES = 4;

    public abstract String getModel();
    public abstract String getColor();
    public abstract Integer getHorsePower();
}
