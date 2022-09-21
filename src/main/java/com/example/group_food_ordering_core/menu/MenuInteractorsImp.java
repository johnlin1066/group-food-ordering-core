package com.example.group_food_ordering_core.menu;

import java.util.List;

import com.example.group_food_ordering_core.menu.dao.MenuRepository;
import com.example.group_food_ordering_core.menu.dto.MenuDS;

public class MenuInteractorsImp implements MenuInteractors{
	
	MenuRepository menuRepository;
	
	public MenuInteractorsImp(MenuRepository menuRepository) {
		this.menuRepository = menuRepository;
	}

	public Long createMenu(MenuDS menuDS) {
		return menuRepository.createMenu(menuDS);
	}

	@Override
	public MenuDS readMenu(Long menuID) {
		return menuRepository.readMenu(menuID);
	}

	@Override
	public List<MenuDS> readAllMenu() {
		return menuRepository.readAllMenu();
	}

}
