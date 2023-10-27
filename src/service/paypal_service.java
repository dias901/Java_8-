package service;

public class paypal_service implements Online_Service {

	@Override
	public Double taxa_pagamento(Double amount) {
	return amount * 0.02;
	}

	@Override
	public Double juro(Double amount, Integer meses) {
		return amount * 0.01 * meses;
	}

}
