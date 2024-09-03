<<<<<<< HEAD
package questao2;
public class Fibonacci {
	
	private int numero;
	
	public Fibonacci(int numero) {
		this.numero=numero;
	}
	
	public String isFibonacci() {
		final String TRUE = " pertence à sequência de Fibonacci.";
		final String FALSE = " não pertence à sequência de Fibonacci.";
		
		if (numero == 0||numero == 1) {
			return "O número " + numero + TRUE;
		}
		
		int a = 0, b = 1;
		 int fib = a + b;

	        while (fib <= numero) {
	            if (fib == numero) {
	                return "O número " + numero + TRUE;
	            }
	            a = b;
	            b = fib;
	            fib = a + b;
	        }

	        return "O número " + numero + FALSE;
	}

}
=======
package questao2;
public class Fibonacci {
	
	private int numero;
	
	public Fibonacci(int numero) {
		this.numero=numero;
	}
	
	public String isFibonacci() {
		final String TRUE = " pertence à sequência de Fibonacci.";
		final String FALSE = " não pertence à sequência de Fibonacci.";
		
		if (numero == 0||numero == 1) {
			return "O número " + numero + TRUE;
		}
		
		int a = 0, b = 1;
		 int fib = a + b;

	        while (fib <= numero) {
	            if (fib == numero) {
	                return "O número " + numero + TRUE;
	            }
	            a = b;
	            b = fib;
	            fib = a + b;
	        }

	        return "O número " + numero + FALSE;
	}

}
>>>>>>> 32d9c163a05020e1d2203bba11dec98c4ce8ed6e
