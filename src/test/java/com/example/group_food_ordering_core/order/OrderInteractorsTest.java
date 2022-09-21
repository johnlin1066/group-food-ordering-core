package com.example.group_food_ordering_core.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.group_food_ordering_core.order.dao.OrderRepository;
import com.example.group_food_ordering_core.order.dto.GroupFoodOrderDS;
import com.example.group_food_ordering_core.order.dto.OrderDS;
import com.example.group_food_ordering_core.order.dto.OrderItemDS;

public class OrderInteractorsTest {
	
	OrderInteractors orderInteractors;
	OrderRepository orderRepository;
	
	@BeforeEach
	public void initial() {
		orderRepository = mock(OrderRepository.class);
		orderInteractors = new OrderInteractorsImp(orderRepository);
	}
	
	@Test
	public void createGroupFoodOrder() {
		GroupFoodOrderDS groupFoodOrderDS = new GroupFoodOrderDS(null, 1L, LocalDateTime.now(), new ArrayList<OrderDS>());
		when(orderRepository.createGroupFoodOrder(groupFoodOrderDS)).thenReturn(1L);
		
		Long groupFoodOrderID = orderInteractors.createGroupFoodOrder(groupFoodOrderDS);
		
		assertEquals(true, (groupFoodOrderID>0));
	}
	
	@Test
	public void createOrder() {
		Long groupFoodOrderID = 1L;
		List<OrderItemDS> orderItemDSList = new ArrayList<OrderItemDS>();
		orderItemDSList.add(new OrderItemDS(1L, "milk", 10, 1));
		OrderDS orderDS = new OrderDS(1L, "user1", orderItemDSList);
		when(orderRepository.createOrder(groupFoodOrderID, orderDS)).thenReturn(1L);
		
		Long orderID = orderInteractors.createOrder(groupFoodOrderID, orderDS);
		
		assertEquals(true, (orderID>0));
	}
	
	@Test
	public void readGroupFoodOrder() {
		Long groupFoodOrderID = 1L;
		when(orderRepository.readGroupFoodOrder(groupFoodOrderID)).thenReturn(new GroupFoodOrderDS());
		
		GroupFoodOrderDS groupFoodOrder = orderInteractors.readGroupFoodOrder(groupFoodOrderID);
		
		assertEquals(true, (groupFoodOrder!=null));
	}
	
	@Test
	public void readAllGroupFoodOrder() {
		when(orderRepository.readAllGroupFoodOrder()).thenReturn(new ArrayList<GroupFoodOrderDS>());
		
		List<GroupFoodOrderDS> groupFoodOrderList = orderInteractors.readAllGroupFoodOrder();
		
		assertEquals(true, (groupFoodOrderList!=null));
	}

}
