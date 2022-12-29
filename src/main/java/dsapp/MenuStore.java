package dsapp;

import dsapp.menu.Menu;
import dsapp.menu.MenuItem;

public class MenuStore {
	
	public static final MenuStore INSTANCE = new MenuStore();
	
	private final Menu mainMenu ;
	private final Menu stackMenu ;
	
	private MenuStore() {
		mainMenu = new Menu(0,"Data Structures");
		
		stackMenu = new Menu(1,"Stack");
		mainMenu.addItem(stackMenu);
		
		stackMenu.addItem(new MenuItem(1, "Push"));
		stackMenu.addItem(new MenuItem(2, "Pop"));
		stackMenu.addItem(new MenuItem(3, "Peak"));
	}

	public Menu getMainMenu() {
		return mainMenu;
	}

	public Menu getStackMenu() {
		return stackMenu;
	}

}
