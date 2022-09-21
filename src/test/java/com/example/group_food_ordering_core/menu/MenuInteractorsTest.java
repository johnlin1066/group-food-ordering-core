package com.example.group_food_ordering_core.menu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.group_food_ordering_core.menu.dao.MenuRepository;
import com.example.group_food_ordering_core.menu.dto.MenuDS;
import com.example.group_food_ordering_core.menu.dto.MenuItemDS;

public class MenuInteractorsTest {
	
	MenuInteractors menuInteractors;
	MenuRepository menuRepository;
	
	@BeforeEach
	public void initial() {
		menuRepository = mock(MenuRepository.class);
		menuInteractors = new MenuInteractorsImp(menuRepository);
	}
	
	@Test
	public void createMenu() {
		List<MenuItemDS> menuItemDSList = new ArrayList<>();
		MenuItemDS menuItemDS = new MenuItemDS(null, "milk", 10);
		menuItemDSList.add(menuItemDS);
		MenuDS menuDS = new MenuDS(null, "milk store", "0912345678", menuItemDSList);
		when(menuRepository.createMenu(menuDS)).thenReturn(1L);
		
		Long menuID = menuInteractors.createMenu(menuDS);
		
		assertEquals(true, (menuID>0L));
	}
	
	@Test
	public void readMenu() {
		Long menuID = 1L;
		when(menuRepository.readMenu(menuID)).thenReturn(new MenuDS());
		
		MenuDS menu = menuInteractors.readMenu(menuID);
		
		assertEquals(true, (menu!=null));
	}
	
	@Test
	public void readAllMenu() {
		when(menuRepository.readAllMenu()).thenReturn(new ArrayList<MenuDS>());
		
		List<MenuDS> menusDSList = menuInteractors.readAllMenu();
		
		assertEquals(true, (menusDSList!=null));
	}

}
