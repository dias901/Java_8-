package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

	private LocalDate Data_inicial;
	private Double amount;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Parcela() {

	}

	public Parcela(LocalDate data_inicial, Double amount) {
		Data_inicial = data_inicial;
		this.amount = amount;
	}

	public LocalDate getData_inicial() {
		return Data_inicial;
	}

	public void setData_inicial(LocalDate data_inicial) {
		Data_inicial = data_inicial;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return Data_inicial.format(fmt)+" - "+amount;
	}
	
}
