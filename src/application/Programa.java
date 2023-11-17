package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import services.ServicoContratado;
import services.ServicoPaypal;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Entre com os dados do contrato \nNúmero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");	
		LocalDate data = LocalDate.parse(sc.nextLine(), formatter);
		System.out.print("Valor do contrato:  ");
		Double valorContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorContrato);
		
		System.out.print("Entre com o número de Parcelas: ");
		int quantidadeParcelas = sc.nextInt();
		
		ServicoContratado servico = new ServicoContratado(new ServicoPaypal());
		servico.processoContrato(contrato, quantidadeParcelas);
		
		for(Parcela p: contrato.getParcelas()) {
			System.out.println("Parcelas: "+"\n"+p.getVencimento()+" - "+p.getValor());
		}	
		
		sc.close();
	}
}
