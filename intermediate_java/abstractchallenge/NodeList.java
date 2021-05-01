package abstractchallenge;

public interface NodeList{

	ListItem getRoot();
	boolean removeItem(ListItem item);
	void traverse(ListItem root);
	boolean addItem(String o);

}
