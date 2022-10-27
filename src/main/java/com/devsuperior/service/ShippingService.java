package com.devsuperior.service;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	private Double shippingTax1 = 20.0;
	private Double shippingTax2 = 12.0;
	private Double shippingTax3 = 0.0;

	public ShippingService() {

	}

	public ShippingService(Double shippingTax1, Double shippingTax2, Double shippingTax3) {

		this.shippingTax1 = shippingTax1;
		this.shippingTax2 = shippingTax2;
		this.shippingTax3 = shippingTax3;
	}

	public Double getShippingTax1() {
		return shippingTax1;
	}

	public Double getShippingTax2() {
		return shippingTax2;
	}

	public Double getShippingTax3() {
		return shippingTax3;
	}

}
