package com.example.group_food_ordering_core.order.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDS {
	
	private Long id;
	private String username;
	private List<OrderItemDS> orderItemDSList = new ArrayList<OrderItemDS>();
	
	public OrderDS() {}
	public OrderDS(Long id, String username, List<OrderItemDS> orderItemDSList) {
		this.id = id;
		this.username = username;
		this.orderItemDSList = orderItemDSList;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<OrderItemDS> getOrderItemDSList() {
		return orderItemDSList;
	}
	public void setOrderItemDSList(List<OrderItemDS> orderItemDSList) {
		this.orderItemDSList = orderItemDSList;
	}
}
