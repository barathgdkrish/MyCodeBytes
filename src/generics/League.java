package generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<U>,U extends Player>{
	
	private String name;
	private ArrayList<T> list = new ArrayList<>();
		
	public League(String name) {
		this.name = name;
	}

	public boolean add(T team) {
		if(list.contains(team)) {
			System.out.println(team.getName()+ "Team already exists");
			return false;
		}else {
			list.add(team);
		}
		return true;
	}
	public String getName() {
		return name;
	}
	
	public void printLeague() {
		Collections.sort(list);
		for(T t: list) {
			System.out.println(t.getName()+": "+t.ranking());
		}
	}
}
