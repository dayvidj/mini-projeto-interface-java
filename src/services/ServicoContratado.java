package services;

import entities.Contrato;
import entities.Parcela;

public class ServicoContratado {
	private ServicoPagamento servico;
		
	public ServicoContratado(ServicoPagamento servico) {
		this.servico = servico;
	}
	
	public void processoContrato(Contrato contrato, Integer meses){		
		double valorParcela = contrato.getValorTotal() / meses;
		
		for(int i = 1; i <= meses; i++) {
			double juros = servico.juros(valorParcela, i); 
			double taxa = servico.taxaPagamento(valorParcela + juros);  
			
			Parcela parcela = new Parcela();

			parcela.setVencimento(contrato.getData().plusMonths(i));
			parcela.setValor(valorParcela + juros + taxa);
		
			contrato.addParcela(parcela);
		}
	}
}
