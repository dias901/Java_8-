package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import service.Contrato_service;
import service.paypal_service;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Dados do Contrato:");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data: ");
		LocalDate data = LocalDate.parse(sc.next(),fmt);
		System.out.print("Valor total do contrato: ");
		double valor = sc.nextDouble();
		
		Contrato cont = new Contrato(number,data,valor);
		
		System.out.print("Numero de Parcelas: ");
		int parcelas = sc.nextInt();
		
		Contrato_service cs = new Contrato_service(new paypal_service());
		cs.process_contract(cont, parcelas);
		
		System.out.println("Parcelas:");
		for(Parcela par : cont.getPar()) {
			System.out.println(par);
		}
		
		sc.close();
	}

}
