package com.simenjk;

import java.util.ArrayList;
import java.util.Locale;

public class PlanetSystem {
    // Private instance variables for PlanetSystem
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets;

    // Creating constructor for PlanetSystem
    // Contains a Star object, and Planet ArrayList
    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    // Getters and Setters for the private instance variables
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }
    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }
    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    // toString method with name, centerStar object and Planets ArrayList
    public String toString() {
        return "%s has the center star %s and has %s planets".formatted
                (name, centerStar.getName(), planets.size());

    }

    public Planet getLargestPlanet() {

        Planet largestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() > largestPlanet.getRadius()) {
                largestPlanet = currentPlanet;
            } else if (currentPlanet.getRadius() == largestPlanet.getRadius()) {
                if (currentPlanet.getMass() > largestPlanet.getMass())
                    largestPlanet = currentPlanet;
            }
        }

        return largestPlanet;
    }

    public Planet getSmallestPlanet() {

        Planet smallestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = currentPlanet;
            } else if (currentPlanet.getRadius() == smallestPlanet.getRadius()) {
                if (currentPlanet.getMass() < smallestPlanet.getMass())
                    smallestPlanet = currentPlanet;
            }
        }
        return smallestPlanet;
    }

    // Oppgave 2_2
    // For loop to get Planet object in a ArrayList as input
    public Planet getPlanetByName(String inputName) {
        for (Planet currentPlanet : planets) {
            if (currentPlanet.getName().equalsIgnoreCase(inputName)) {

                return currentPlanet;
            }
        }

        return null;
    }


}



