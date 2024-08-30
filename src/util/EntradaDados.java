package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDados {
	private static final Scanner scanner = new Scanner(System.in); // Scanner criado uma vez

    // Método para ler número inteiro do usuário
    public static int leNumero() {
        while (true) {
            try {
                System.out.print("Informe um número: ");
                int numero = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.nextLine(); // Limpar o buffer do erro de entrada
            }
        }
    }

    // Método para ler a string do usuário
    public static String leString() {
        System.out.print("Escreva a string a ser invertida: ");
        return scanner.nextLine();
    }
    
    public static Scanner getScanner() {
    	return scanner;
    }

}
