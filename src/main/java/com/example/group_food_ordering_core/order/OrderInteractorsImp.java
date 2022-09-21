package com.example.group_food_ordering_core.order;

import java.util.List;

import com.example.group_food_ordering_core.order.dao.OrderRepository;
import com.example.group_food_ordering_core.order.dto.GroupFoodOrderDS;
import com.example.group_food_ordering_core.order.dto.OrderDS;

public class OrderInteractorsImp implements OrderInteractors{
	
	OrderRepository orderRepository;
	
	public OrderInteractorsImp(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public Long createGroupFoodOrder(GroupFoodOrderDS groupFoodOrderDS) {
		return orderRepository.createGroupFoodOrder(groupFoodOrderDS);
	}

	@Override
	public Long createOrder(Long groupFoodOrderID, OrderDS orderDS) {
		return orderRepository.createOrder(groupFoodOrderID, orderDS);
	}

	@Override
	public GroupFoodOrderDS readGroupFoodOrder(Long groupFoodOrderID) {
		return orderRepository.readGroupFoodOrder(groupFoodOrderID);
	}

	@Override
	public List<GroupFoodOrderDS> readAllGroupFoodOrder() {
		return orderRepository.readAllGroupFoodOrder();
	}

}
