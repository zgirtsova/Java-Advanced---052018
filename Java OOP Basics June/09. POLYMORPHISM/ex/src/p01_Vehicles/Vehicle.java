package p01_Vehicles;

public abstract class Vehicle {
    private double fuel;
    private double consumption;

    public Vehicle(double fuel, double consumption) {
        this.setFuel(fuel);
        this.setConsumption(consumption);
    }

    protected void setFuel(double fuel) {
        this.fuel = fuel;
    }

    protected final double getFuel() {
        return fuel;
    }

    protected final double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double fuel);
}
