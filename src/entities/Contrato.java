package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contrato {
	private Integer numero;
	private LocalDate data;
	private Double valorTotal;
	
	private ArrayList<Parcela> parcelas = new ArrayList<>();
	
	public Contrato() {		
	}
	public Contrato(int numero, LocalDate data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ArrayList<Parcela> getParcelas() {
		return parcelas;
	}
	public void addParcela(Parcela parcela) {
		this.parcelas.add(parcela);
	}
}
