package abstractchallenge;

public abstract class ListItem {

	protected ListItem previous = null;
	protected ListItem next = null;
	protected Object value;
	public ListItem(Object value) {
		this.value = value;
		
	}
	
	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	
	abstract int compareTo(ListItem item);
	
	public Object getValue() {
		return this.value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
