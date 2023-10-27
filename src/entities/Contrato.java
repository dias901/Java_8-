package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private int holder;
	private LocalDate data;
	private Double valor_contrato;
	private List<Parcela> par = new ArrayList<>();
	
	public Contrato() {

	}

	public Contrato(int holder, LocalDate data, Double valor_contrato) {
		this.holder = holder;
		this.data = data;
		this.valor_contrato = valor_contrato;
	}

	public int getHolder() {
		return holder;
	}

	public void setHolder(int holder) {
		this.holder = holder;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValor_contrato() {
		return valor_contrato;
	}

	public void setValor_contrato(Double valor_contrato) {
		this.valor_contrato = valor_contrato;
	}

	public List<Parcela> getPar() {
		return par;
	}
}
