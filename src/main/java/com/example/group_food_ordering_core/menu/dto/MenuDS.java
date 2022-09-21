package com.example.group_food_ordering_core.menu.dto;

import java.util.ArrayList;
import java.util.List;

public class MenuDS {
	
	private Long id;
	private String storeName;
	private String storePhone;
	private List<MenuItemDS> menuItemDSList = new ArrayList<MenuItemDS>();
	
	public MenuDS() {}
	public MenuDS(Long id, String storeName, String storePhone, List<MenuItemDS> menuItemDSList) {
		this.storeName = storeName;
		this.storePhone = storePhone;
		this.id = id;
		this.menuItemDSList = menuItemDSList;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStorePhone() {
		return storePhone;
	}
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}
	public List<MenuItemDS> getMenuItemDSList() {
		return menuItemDSList;
	}
	public void setMenuItemDSList(List<MenuItemDS> menuItemDSList) {
		this.menuItemDSList = menuItemDSList;
	}
}
