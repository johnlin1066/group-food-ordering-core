package com.example.group_food_ordering_core.order;

import java.util.List;

import com.example.group_food_ordering_core.order.dto.GroupFoodOrderDS;
import com.example.group_food_ordering_core.order.dto.OrderDS;

public interface OrderInteractors {
	
	public Long createGroupFoodOrder(GroupFoodOrderDS groupFoodOrderDS);
	public Long createOrder(Long groupFoodOrderID, OrderDS orderDS);
	public GroupFoodOrderDS readGroupFoodOrder(Long groupFoodOrderID);
	public List<GroupFoodOrderDS> readAllGroupFoodOrder();

}
