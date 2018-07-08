package app.entities;

import app.constants.Constants;
import app.contracts.SuperPower;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Power implements SuperPower {

    private String name;
    private double powerPoints;

    public Power(String name, double powerPoints) {
        this.setName(name);
        this.setPowerPoints(powerPoints);
    }

    public void setName(String name) {

        Pattern pattern = Pattern.compile("@[A-Za-z_]{3,}@");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(Constants.POWER_NAME_ERR);
        }
        this.name = name;
    }

    public void setPowerPoints(double powerPoints) {
        if (powerPoints < 0) {
            throw new IllegalArgumentException(Constants.POWER_POINTS_ERR);
        }
        this.powerPoints = powerPoints;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPowerPoints() {
        return this.powerPoints + this.getName().length() / 2.0;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
