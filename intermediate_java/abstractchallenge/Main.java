package abstractchallenge;

import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	/*
	 * MyLinkedList<ListItem> list = new MyLinkedList<ListItem>();
	 * list.traverse(list.getRoot());
	 * 
	 * String stringData = "0 1 2 3 4 5 6 7 8 9"; String[] strings=
	 * stringData.split(" "); for(String s:strings) { list.addItem(s); }
	 * list.traverse(list.getRoot());
	 * 
	 * list.removeItem(new Node(1)); list.traverse(list.getRoot());
	 * list.removeItem(new Node(0)); list.traverse(list.getRoot());
	 */
	LinkedList<Object> myList = new LinkedList<Object>();
	myList.add(0);
	myList.add("Me");
	
	System.out.println(myList.get(0)+" "+myList.get(1));
	
	
}
}
