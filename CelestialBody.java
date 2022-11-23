package com.simenjk;


// Celestial Body er et himmellegeme i universet. Planet, stjerne, måne osv...

public abstract class CelestialBody {
    // Instance variables
    private String name;
    private double radius, mass;

    // Constructors for CelestialBody
    public CelestialBody() {
    }

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    // Abstract methods
    public abstract double getMassInKg();

    public abstract double getRadiusInKM();


}

