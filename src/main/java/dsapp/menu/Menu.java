package dsapp.menu;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Menu extends MenuItem{

	public Menu(int index, String title) {
		super(index, title);
	}

	@JsonManagedReference
	private List<MenuItem> items = new ArrayList<>();
	
	public void addItem(MenuItem menuItem) {
		menuItem.setParent(this);
		getItems().add(menuItem);
	}

	public List<MenuItem> getItems() {
		return items;
	}

	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
	
	
}
