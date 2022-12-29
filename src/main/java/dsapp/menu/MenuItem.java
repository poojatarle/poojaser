package dsapp.menu;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class MenuItem {
	private int index;
	private String title;
	
	@JsonBackReference
	private Menu parent;
	
	public MenuItem(int index, String title) {
		setIndex(index);
		setTitle(title);
	}
	
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Menu getParent() {
		return parent;
	}
	public void setParent(Menu parent) {
		this.parent = parent;
	}
}
