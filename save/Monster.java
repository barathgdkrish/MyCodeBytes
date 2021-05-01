package save;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

	private String name;
	private int hitPoints;
	private int Strength;
	
	public Monster() {
		this.name = "default";
		this.hitPoints = 0;
		Strength = 0;
	}
	public Monster(String name, int hitPoints, int strength, String weapon) {
		this.name = name;
		this.hitPoints = hitPoints;
		Strength = strength;
	}
	public String getName() {
		return name;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public int getStrength() {
		return Strength;
	}
		
	@Override
	public String toString() {
		return "Monster [name=" + name + ", hitPoints=" + hitPoints + ", Strength=" + Strength + "]";
	}
	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0,this.name);
		values.add(1,String.valueOf(this.hitPoints));
		values.add(2,String.valueOf(this.Strength));
		return values;
	}
	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null &&savedValues.size()>0) {
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.Strength = Integer.parseInt(savedValues.get(2));
		}
		
	}
}
