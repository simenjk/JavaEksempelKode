package com.simenjk;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        // Star object
        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        // Planet objects
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380, sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660, sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);

        // ArrayList containing planet objects
        ArrayList<Planet> planetList = new ArrayList<>();

        planetList.add(mercury);
        planetList.add(venus);
        planetList.add(earth);
        planetList.add(mars);
        planetList.add(jupiter);
        planetList.add(saturn);
        planetList.add(uranus);
        planetList.add(neptune);

        PlanetSystem solarSystem = new PlanetSystem("Solar System", sun, planetList);



        /*
        // Oppgave2_2
        System.out.println("\n OPPGAVE 2_2");

        Scanner objectOfPlanet = new Scanner(System.in);
        System.out.println("Enter name of Planet: ");
        String planetName = objectOfPlanet.nextLine();

        System.out.println(solarSystem.getPlanetByName(planetName));

        // Oppgave 2_5b:
        System.out.println("\n OPPGAVE 2_5");

        for (int i = 0; i <= 360; i += 90) {
            System.out.println("Earth has a distance of %.0fkm to the Sun at %d degrees".formatted(earth.distanceToCentralBodyRadians(i), i));
        }

        // Oppgave 2_6:
        System.out.println("\n OPPGAVE 2_6");

        for (int i = 0; i <= 180; i += 45) {
            System.out.println("At a distance of %.0fkm, Earth has a velocity %.2fkm/s".formatted(earth.distanceToCentralBodyRadians(i), earth.orbitingVelocityKilometer(earth.distanceToCentralBodyDegrees(i))));
        }
        */

    }
}
