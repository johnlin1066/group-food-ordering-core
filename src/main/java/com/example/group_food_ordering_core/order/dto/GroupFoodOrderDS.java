package com.example.group_food_ordering_core.order.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GroupFoodOrderDS {
	
	private Long id;
	private Long menuID;
	private LocalDateTime endTime;
	private List<OrderDS> orderDSList = new ArrayList<OrderDS>();
	
	public GroupFoodOrderDS() {}
	public GroupFoodOrderDS(Long id, Long menuID, LocalDateTime endTime, List<OrderDS> orderDSList) {
		this.id = id;
		this.menuID = menuID;
		this.endTime = endTime;
		this.orderDSList = orderDSList;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMenuID() {
		return menuID;
	}
	public void setMenuID(Long menuID) {
		this.menuID = menuID;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public List<OrderDS> getOrderDSList() {
		return orderDSList;
	}
	public void setOrderDSList(List<OrderDS> orderDSList) {
		this.orderDSList = orderDSList;
	}
}
