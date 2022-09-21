package com.example.group_food_ordering_core.menu;

import java.util.List;

import com.example.group_food_ordering_core.menu.dto.MenuDS;

public interface MenuInteractors {
	
	public Long createMenu(MenuDS menuDS);
	public MenuDS readMenu(Long menuID);
	public List<MenuDS> readAllMenu();

}
