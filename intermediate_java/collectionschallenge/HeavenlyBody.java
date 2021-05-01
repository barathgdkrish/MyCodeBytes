package collectionschallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @param <T>
 */
public class HeavenlyBody {

	private final Key key;
	public Key getKey() {
		return new Key(key);
	}

	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public enum BodyTypes {
		STAR, PLANET, DWARF_PLANET, MOON, COMET, ASTEROID
	}

	public HeavenlyBody(final String name, final double orbitalPeriod, final BodyTypes bodyType) {
		this.key = new Key(name, bodyType);
		this.satellites = new HashSet<HeavenlyBody>();
		this.orbitalPeriod = orbitalPeriod;

	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public boolean addSatellites(final HeavenlyBody satellite) {
		return this.satellites.add(satellite);
	}

	public Set<?> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	@Override
	public final boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof HeavenlyBody) {
			final HeavenlyBody object = ((HeavenlyBody) obj);
			if (object.key.getBodyType().equals(this.key.getBodyType())) {
				return this.key.getName().equals(object.key.getName());
			}
		}
		return false;
	}

	@Override
	public final int hashCode() {
		return this.key.getName().hashCode() + 57 + this.key.getBodyType().hashCode();
	}

	@Override
	public String toString() {
		return this.key.getName() + ": " + this.key.getBodyType() + ", " + orbitalPeriod;
	}

	class Key {
		private final String name;
		private final BodyTypes bodyType;

		public Key(String name, BodyTypes bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}

		public Key(Key key) {
			this.name = key.name;
			this.bodyType = key.bodyType;
			}

		public String getName() {
			return name;
		}

		public BodyTypes getBodyType() {
			return bodyType;
		}

	}
}
