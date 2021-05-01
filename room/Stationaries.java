package room;
public class Stationaries {
private String name;
private String type;
private String utility;
protected Stationaries(String name, String type, String utility) {
	this.name = name;
	this.type = type;
	this.utility = utility;
}
public void useStationary() {
	System.out.println("Using the "+name+" to "+utility);
}
public String getName() {
	return name;
}
public String getType() {
	return type;
}
public String getUtility() {
	return utility;
}

}
