package services;

public class ServicoPaypal implements ServicoPagamento {

	@Override
	public Double taxaPagamento(Double valor) { 
		return valor * 2 / 100;
	}
	@Override
	public Double juros(Double valor, Integer parcela) {
		return (valor * 1 / 100) * parcela;
	}

}
