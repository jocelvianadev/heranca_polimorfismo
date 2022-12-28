package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Informe o número de contribuintes: ");
			int numeroContribuintes = scan.nextInt();

			List<Contribuinte> lista = new ArrayList<>();
			for (int i = 1; i <= numeroContribuintes; i++) {
				System.out.println("Dados do contribuinte " + i + ":");
				System.out.print("Pessoa física ou Jurídica?  F/J : ");
				char tipo = scan.next().charAt(0);
				System.out.print("Nome: ");
				String nome = scan.nextLine();
				scan.next();
				System.out.print("Renda anual: R$ ");
				Double rendaAnual = scan.nextDouble();
				
				if(tipo == 'f'){
						System.out.print("Gastos com saúde:  R$ ");
						Double gastoSaude = scan.nextDouble();
						PessoaFisica pf = new PessoaFisica(nome, rendaAnual, gastoSaude);
						lista.add(pf);
				}
				if(tipo =='j') {
					System.out.print("Número de funcionários: ");
					Integer numeroFuncionarios = scan.nextInt();
					PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
					lista.add(pj);
					
				}
			}
			
			System.out.println();
			System.out.println("Imposto: ");
			for(Contribuinte contr : lista) {
				System.out.println(contr.getNome() + ": R$ " + String.format("%.2f", contr.imposto()));
			}
			double soma = 0.0;
			for(Contribuinte contr : lista) {
				soma += contr.imposto();
			}
			System.out.println();
			System.out.println("Total de impostos: R$ " + String.format("%.2f", soma));
		} 
		catch (Exception e) {
			System.out.println("Aconteceu um erro: " + e.getMessage());
		}

		finally {
			scan.close();
		}
	}

}
