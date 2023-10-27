package service;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcela;

public class Contrato_service {

	private Online_Service on;
	
	public Contrato_service(Online_Service on) {
		this.on = on;
	}

	public void process_contract(Contrato cont, Integer meses) {
		double valor_base = cont.getValor_contrato()/meses;
		
		for (int i =1; i<=meses;i++){
			LocalDate venc_pgto = cont.getData().plusMonths(i); //o vencimento da parcela vai sempre ser 1 mês depois
			
			double juros= on.juro(valor_base, i);
			double taxa= on.taxa_pagamento(valor_base + juros);
			double pgto = valor_base + juros + taxa;
			
			cont.getPar().add(new Parcela(venc_pgto,pgto));
		}
	}
}
