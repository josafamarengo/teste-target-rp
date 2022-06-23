package main.com.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class questao2 {

	
		/* =================================================
		 * Identifica os n�meros de Fibonacci.
		 * Soma o n�mero atual com o aterior a ele. 
		 * =================================================*/
		static long fibo(int n) {
	        int F = 0;     // atual
	        int ant = 0;   // anterior
	
	        for (int i = 1; i <= n; i++) {
	
	            if (i == 1) {
	                F = 1;
	                ant = 0;
	            } else {
	                F += ant;
	                ant = F - ant;
	            }
	
	        }
	        
	        return F;
	    }

	    public static void main(String[] args) {
	    	
	    	/*=====================================================================================
	    	 *  Cria uma collection de n�meros inteiros gerados pela fun��o de fibo at� o 47� termo.
	    	 *====================================================================================== */
	    	Collection<Integer> fibonacci = new ArrayList<Integer>(50);

			for (int i = 0; i < 47; i++) {
			   fibonacci.add((int) questao2.fibo(i));
			}
			
			//=======================================================================
	    	
	    	System.out.println("Descubra se um determinado n�mero � um n�mero de Fibonacci.\nDigite um n�mero:");
	    	
	    	try (Scanner digite = new Scanner(System.in)) {
				int numero = digite.nextInt();
				
				// Retorna TRUE, caso o n�mero esteja na lista de n�meros de Fibonacci.
				boolean result = fibonacci.contains(numero);
				
				System.out.print(fibonacci);
				if(result) {
					System.out.println("\nResposta:\n" + numero + " � um n�mero de Fibbonacci");
				} else System.out.println("\nResposta:\n" + numero + " n�o � um n�mero de Fibonacci.");
			}
	    }
		
}
