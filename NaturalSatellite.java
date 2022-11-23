package com.simenjk;

public abstract class NaturalSatellite extends CelestialBody {
    // Instance variables
    private double semiMajorAxis, eccentricity, orbitalPeriod;
    private CelestialBody centralCelestialBody;

    // Constants
    static final double AU = 149597871;
    static final double gravityConstant = 0.00000000006674;


    // Constructors for NaturalSatellite
    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public NaturalSatellite(String name, double radius, double mass) {
        super(name, radius, mass);
    }


    // Getters and Setters
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }
    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }
    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public CelestialBody getCentralCelestialBody() {
        return centralCelestialBody;
    }
    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }


    public double distanceToCentralBodyDegrees(double degrees) {
        double distanceInAU = (semiMajorAxis * (1 - Math.pow(eccentricity, 2))) / (1 + eccentricity * Math.cos(degrees));
        return distanceInAU * AU;
    }

    // Oppgave 2_5c :
    public double distanceToCentralBodyRadians(double radians) {
        return distanceToCentralBodyDegrees(Math.toRadians(radians));
    }

    // Oppgave 2_6b :
    public double orbitingVelocityMeter(double distance) {
        return Math.sqrt(((gravityConstant * centralCelestialBody.getMassInKg()) / (distance * 1000)));
    }

    public double orbitingVelocityKilometer(double distance) {
        return orbitingVelocityMeter(distance) / 1000;
    }

}
