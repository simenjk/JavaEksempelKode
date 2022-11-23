package com.simenjk;

public class Star extends CelestialBody {
    // Instance variable
    private double effectiveTemp;

    // Constants
    static final double RSUN = 695700;
    static final double MSUN = 1.98892E30;

    // Creating constructor for Star
    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    // toString method with name, radius, mass and effectivetemp
    public String toString() {
        return "The star %s, has a radius of %s, a mass of %s and an effective temperature of %s".formatted(
                super.getName(), super.getRadius(), super.getMass(), effectiveTemp);

    }

    @Override
    public double getMassInKg() {
        return getMass() * MSUN;
    }

    @Override
    public double getRadiusInKM() {
        return getRadius() * RSUN;
    }

}
