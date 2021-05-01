package abstractchallenge;

public class MyLinkedList implements NodeList{

	private ListItem root;
	public MyLinkedList() {
		this.root = null;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}
	@Override
	public boolean addItem(String o) {
		ListItem newItem = new Node(o);
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = currentItem.compareTo(newItem);
			if(comparison<0) {
				//New item is greater, so move next
				if(currentItem.next()!= null) {
					currentItem = currentItem.next();
				}else {
					//there is no next, so insert the newItem in here
					currentItem.setNext(newItem).setPrevious(currentItem);//setNext(newItem) returns newItem of the type ListItem (See Node Class)
					return true;
				}
			}else if(comparison > 0) {
				//New Item is less than the current item
				
				if(currentItem.previous()!=null) {
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					currentItem.setPrevious(newItem);
					newItem.setNext(currentItem);
				}else {
					//node with a previous is the root
					newItem.setNext(this.root).setPrevious(newItem);
					this.root = newItem;
				}
				return true;	
			}else {
				System.out.println(newItem.getValue()+ " already present, not added.");
				return false;
			}
			
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if (item!=null) {
			System.out.println("Removing item "+item.getValue());
		}
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if(comparison == 0) {
				//if the item and the current item are equal
				if(currentItem == this.root) {
					this.root = currentItem.next();
				}else {
				currentItem.previous().setNext(currentItem.next());
				
				if(currentItem.next!=null) {
					currentItem.next().setPrevious(currentItem.previous());
				}
				}
				return true;
			}else if(comparison < 0) {
				currentItem = currentItem.next();
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if(root == null) {
			System.out.println("The list is empty");
		}else {
			while(root != null) {
				System.out.println(root.getValue());
				root = root.next();
			}
		}
		
	}
	
}
