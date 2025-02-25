package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	public List<Item> getItems() {
        return items;
    }
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		BookPrinter visitor = new BookPrinter(this);
        visitor.visitItems();
	}

	public void printOnlyCDs() {
		CDPrinter visitor = new CDPrinter(this);
        visitor.visitItems();
	}

}
