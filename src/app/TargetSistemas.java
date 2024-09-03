<<<<<<< HEAD
package app;
import java.util.Scanner;

import questao1.Soma;
import questao2.Fibonacci;
import questao3.FaturamentoDistribuidora;
import questao4.Distribuidora;
import questao4.Estado;
import questao5.InverteString;
import util.EntradaDados;

public class TargetSistemas {
	
	public TargetSistemas() {
		targetSistemas();
	
	}
	
	public static void main(String[] args) {
		new TargetSistemas();
	}
	
	public void targetSistemas() {
	
		try(Scanner  scanner = new Scanner(System.in)){
			System.out.println("Respostas enviadas por: Eloiza Azevedo Marcondes de Souza");
			
			System.out.print("\n -> Questão 1");
			System.out.print("\nResposta: SOMA = ");
			Soma.soma();
			
			System.out.println("\n -> Questão 2");
			Fibonacci fibo = new Fibonacci(EntradaDados.leNumero());
			System.out.printf("Resposta: %s\n", fibo.isFibonacci());
			
			System.out.println("\n -> Questão 3");
			FaturamentoDistribuidora fd = new FaturamentoDistribuidora();
			System.out.println("Resposta:");
	        System.out.printf("Menor valor de faturamento ocorrido em um dia do mês: R$ %,.2f\n", fd.getMenorValor());
	        System.out.printf("Maior valor de faturamento ocorrido em um dia do mês: R$ %,.2f\n", fd.getMaiorValor());
	        System.out.printf("Número de dias com faturamento superior à média mensal: %d\n", fd.getDiasAcimaDaMedia());			
			
	        System.out.println("\n -> Questão 4");
   			System.out.println("Resposta:");
   			// Criar instâncias dos estados com seus respectivos faturamentos
   	        Estado sp = new Estado("SP", 67836.43);
   	        Estado rj = new Estado("RJ", 36678.66);
   	        Estado mg = new Estado("MG", 29229.88);
   	        Estado es = new Estado("ES", 27165.48);
   	        Estado outros = new Estado("Outros", 19849.53);

   	        // Criar a instância da distribuidora e adicionar os estados
   	        Distribuidora distribuidora = new Distribuidora();
   	        distribuidora.adicionarEstado(sp);
   	        distribuidora.adicionarEstado(rj);
   	        distribuidora.adicionarEstado(mg);
   	        distribuidora.adicionarEstado(es);
   	        distribuidora.adicionarEstado(outros);

   	        // Exibir os percentuais de representação de cada estado
   	        distribuidora.exibirPercentuais();
   	        
   	        System.out.println("\n -> Questão 5");
   	        System.out.println("Resposta:");
   	        InverteString inverteString = new InverteString(EntradaDados.leString());
   	        System.out.println("String invertida: " + inverteString.getTextoInvertido());
	        
		} catch (Exception e) {
			System.out.println("Erro inesperado. Tente novamente.");
		}
		finally {
			EntradaDados.getScanner().close();
		}
		
	}
}
=======
package app;
import java.util.Scanner;

import questao1.Soma;
import questao2.Fibonacci;
import questao3.FaturamentoDistribuidora;
import questao4.Distribuidora;
import questao4.Estado;
import questao5.InverteString;
import util.EntradaDados;

public class TargetSistemas {
	
	public TargetSistemas() {
		targetSistemas();
	
	}
	
	public static void main(String[] args) {
		new TargetSistemas();
	}
	
	public void targetSistemas() {
	
		try(Scanner  scanner = new Scanner(System.in)){
			System.out.println("Respostas enviadas por: Eloiza Azevedo Marcondes de Souza");
			
			System.out.print("\n -> Questão 1");
			System.out.print("\nResposta: SOMA = ");
			Soma.soma();
			
			System.out.println("\n -> Questão 2");
			Fibonacci fibo = new Fibonacci(EntradaDados.leNumero());
			System.out.printf("Resposta: %s\n", fibo.isFibonacci());
			
			System.out.println("\n -> Questão 3");
			FaturamentoDistribuidora fd = new FaturamentoDistribuidora();
			System.out.println("Resposta:");
	        System.out.printf("Menor valor de faturamento ocorrido em um dia do mês: R$ %,.2f\n", fd.getMenorValor());
	        System.out.printf("Maior valor de faturamento ocorrido em um dia do mês: R$ %,.2f\n", fd.getMaiorValor());
	        System.out.printf("Número de dias com faturamento superior à média mensal: %d\n", fd.getDiasAcimaDaMedia());			
			
	        System.out.println("\n -> Questão 4");
   			System.out.println("Resposta:");
   			// Criar instâncias dos estados com seus respectivos faturamentos
   	        Estado sp = new Estado("SP", 67836.43);
   	        Estado rj = new Estado("RJ", 36678.66);
   	        Estado mg = new Estado("MG", 29229.88);
   	        Estado es = new Estado("ES", 27165.48);
   	        Estado outros = new Estado("Outros", 19849.53);

   	        // Criar a instância da distribuidora e adicionar os estados
   	        Distribuidora distribuidora = new Distribuidora();
   	        distribuidora.adicionarEstado(sp);
   	        distribuidora.adicionarEstado(rj);
   	        distribuidora.adicionarEstado(mg);
   	        distribuidora.adicionarEstado(es);
   	        distribuidora.adicionarEstado(outros);

   	        // Exibir os percentuais de representação de cada estado
   	        distribuidora.exibirPercentuais();
   	        
   	        System.out.println("\n -> Questão 5");
   	        System.out.println("Resposta:");
   	        InverteString inverteString = new InverteString(EntradaDados.leString());
   	        System.out.println("String invertida: " + inverteString.getTextoInvertido());
	        
		} catch (Exception e) {
			System.out.println("Erro inesperado. Tente novamente.");
		}
		finally {
			EntradaDados.getScanner().close();
		}
		
	}
}
>>>>>>> 32d9c163a05020e1d2203bba11dec98c4ce8ed6e
