package com.simenjk;

public class Planet extends NaturalSatellite {

    // Constants
    static final double RJUP = 71492;
    static final double MJUP = 1.898E27;
    static final double MEARTH = 5.972E24;
    static final double REARTH = 6371;

    // Creating constructor for Planet
    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    // toString representation for Planet
    public String toString() {
        return "Planet %s has a radius of %s and a mass of %s".formatted(
                super.getName(), super.getRadius(), super.getMass());
    }

    // Method for calculating surface gravity on a planet
    public double surfaceGravity() {
        // Gravity constant
        double gravConstant = 6.67408E-11;
        // Using returned value from massPlanet method
        double massPlanet = getMassInKg();
        // Using returned value from radiusPlanet method and converting it to meters
        double radiusPlanetMeter = getRadiusInKM() * 1000;
        // Formula for surface gravity
        return (gravConstant * massPlanet) / (Math.pow(radiusPlanetMeter, 2));
    }


    public double mEarthCalculate() {
        return MEARTH * super.getMass();
    }

    public double rEarthCalculate() {
        return REARTH * super.getRadius();
    }


    @Override
    public double getMassInKg() {
        return MJUP * super.getMass();
    }

    @Override
    public double getRadiusInKM() {
        return RJUP * super.getRadius();
    }

}
