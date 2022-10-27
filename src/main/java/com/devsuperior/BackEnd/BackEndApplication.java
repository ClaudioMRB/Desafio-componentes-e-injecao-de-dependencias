package com.devsuperior.BackEnd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Order;
import com.devsuperior.service.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class BackEndApplication implements CommandLineRunner{
	
	private OrderService orderService;
	
	public BackEndApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1010, 800.0, 10.0);
		System.out.println("Codigo do pedido "+ order.getCode() + "\nValor total: " + String.format("%.2f ", orderService.OrderService(order)));
	}

}
