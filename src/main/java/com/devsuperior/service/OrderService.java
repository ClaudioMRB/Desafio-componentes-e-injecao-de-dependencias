package com.devsuperior.service;

import org.springframework.stereotype.Service;
import com.devsuperior.entities.Order;
@Service
public class OrderService {

	
	
	private ShippingService shippingService;
	 Order order ;

	public OrderService() {

	}
	
	public OrderService(Order order, ShippingService shippingService) {
		this.order = order;
	this.shippingService = shippingService;
	}

	public Double CalService(Order order) {

		if (order.getBasic() >= 200) {
			return shippingService.taxShipping(order.getBasic()) - (order.getBasic() * (order.getDiscount() / 100));
		} else if (order.getBasic() >= 100 && order.getBasic() < 200) {
			return shippingService.taxShipping(order.getBasic()) - (order.getBasic() * (order.getDiscount() / 100));
		} else {
			return shippingService.taxShipping(order.getBasic());
		}

	}

}
