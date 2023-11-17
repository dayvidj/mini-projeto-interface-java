package services;

public interface ServicoPagamento {
	public Double taxaPagamento(Double Valor);
	public Double juros(Double valor, Integer meses);
}
