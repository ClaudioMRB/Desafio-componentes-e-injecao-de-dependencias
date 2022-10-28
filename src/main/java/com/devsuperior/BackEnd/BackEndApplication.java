package com.devsuperior.BackEnd;

import com.devsuperior.service.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Order;
import com.devsuperior.service.OrderService;



@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class BackEndApplication implements CommandLineRunner{
	
	OrderService orderService;

	public BackEndApplication(OrderService orderService) {
		this.orderService = orderService;
	}




	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ShippingService shippingService = new ShippingService();
		Order order = new Order(1309, 95.90, 0.0);
		OrderService orderService = new OrderService(order, shippingService);
		System.out.println();
		System.out.println("Pedido Codigo " + order.getCode() + "\nValor total: R$ "
				+ String.format("%.2f ", orderService.CalService(order)));
	}



	

}
