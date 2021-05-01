package save;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

	private String name;
	private int hitPoints;
	private int Strength;
	private String weapon;
	
	public Player() {
		this.name = "default";
		this.hitPoints = 0;
		Strength = 0;
		this.weapon = "Hand";
	}
	public Player(String name, int hitPoints, int strength, String weapon) {
		this.name = name;
		this.hitPoints = hitPoints;
		Strength = strength;
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getStrength() {
		return Strength;
	}
	public void setStrength(int strength) {
		Strength = strength;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", hitPoints=" + hitPoints + ", Strength=" + Strength + ", weapon=" + weapon
				+ "]";
	}
	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0,this.name);
		values.add(1,String.valueOf(this.hitPoints));
		values.add(2,String.valueOf(this.Strength));
		values.add(3,this.weapon);
		return values;
	}
	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null &&savedValues.size()>0) {
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.Strength = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
		
	}
	
	
	
}
