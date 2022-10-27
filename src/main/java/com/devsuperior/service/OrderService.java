package com.devsuperior.service;

import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;
@Service
public class OrderService {

	private Order order;
	private ShippingService shippingService;

	public OrderService() {

	}
	
	public OrderService(Order order, ShippingService shippingService) {
		this.order = order;
		this.shippingService = shippingService;
	}

	public Double OrderService(Order order) {

		if (order.getBasic() >= 200) {
			return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
		} else if (order.getBasic() >= 100) {
			return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100))
					+ shippingService.getShippingTax2();
		} else {
			return order.getBasic() + shippingService.getShippingTax1();
		}

	}

}
