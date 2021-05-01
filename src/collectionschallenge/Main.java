package collectionschallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import collectionschallenge.HeavenlyBody.BodyTypes;

public class Main {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {

		HeavenlyBody temp = new HeavenlyBody("Mercury", 88, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Venus", 225, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Earth", 365, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27, BodyTypes.MOON);
		solarSystem.put(tempMoon.getKey().getName(), tempMoon);
		temp.addSatellites(tempMoon);

		temp = new HeavenlyBody("Mars", 687, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Deimos", 1.3, BodyTypes.MOON);
		solarSystem.put(tempMoon.getKey().getName(), tempMoon);
		temp.addSatellites(tempMoon);
		// temp is still Mars

		tempMoon = new HeavenlyBody("Phobos", 0.3, BodyTypes.MOON);
		solarSystem.put(tempMoon.getKey().getName(), tempMoon);
		temp.addSatellites(tempMoon);
		// temp is still Mars

		temp = new HeavenlyBody("Jupiter", 4332, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Io", 1.8, BodyTypes.MOON);
		solarSystem.put(tempMoon.getKey().getName(), tempMoon);
		temp.addSatellites(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody("Europa", 3.5, BodyTypes.MOON);
		solarSystem.put(tempMoon.getKey().getName(), tempMoon);
		temp.addSatellites(tempMoon);
		// temp is still Jupiter

		tempMoon = new HeavenlyBody("Ganymede", 7.1, BodyTypes.MOON);
		solarSystem.put(tempMoon.getKey().getName(), tempMoon);
		temp.addSatellites(tempMoon);
		// temp is still Jupiter

		tempMoon = new HeavenlyBody("Callisto", 16.7, BodyTypes.MOON);
		solarSystem.put(tempMoon.getKey().getName(), tempMoon);
		temp.addSatellites(tempMoon);
		// temp is still Jupiter

		temp = new HeavenlyBody("Saturn", 10759, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Uranus", 30660, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Neptune", 165, BodyTypes.PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Pluto", 248, BodyTypes.DWARF_PLANET);
		solarSystem.put(temp.getKey().getName(), temp);
		planets.add(temp);

		System.out.println("Planets");
		for (HeavenlyBody planet : planets) {
			System.out.println("\t" + planet.getKey().getName());
		}

		HeavenlyBody body = solarSystem.get("Mars");
		System.out.println("Moons of " + body.getKey().getName());
		/*
		 * for(Object jupiterMoon: body.getSatellites()){ System.out.println("\t" +
		 * jupiterMoon.getKey().getName()); }
		 * 
		 * Set<HeavenlyBody> moons = new HashSet<>(); for(HeavenlyBody planet : planets)
		 * { moons.addAll(planet.getSatellites()); }
		 * 
		 * System.out.println("All Moons"); for(HeavenlyBody moon : moons) {
		 * System.out.println("\t" + moon.getName()); }
		 * 
		 * HeavenlyBody pluto = new HeavenlyBody("Pluto", 842); planets.add(pluto);
		 */

		for (HeavenlyBody planet : planets) {
			System.out.println(planet.getKey().getName() + ": " + planet.getOrbitalPeriod());
		}
	}
}
