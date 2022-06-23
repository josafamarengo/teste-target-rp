package main.com.teste;

public class questao5 {

	public static void main(String[] args) {
				
		String texto = "Esse texto vai ser invertido";
	    int len = texto.length();
	    char[] tempCharArray = new char[len];
	    char[] charArray = new char[len];
	 
	    /* Separa os caracteres da String em um Array de Chars
	     * 
	     * O iterador "i" faz com que o loop "for" seja executado o exato número de caracteres da String.
	     * 
	     * Além disso, ele também é usado como parâmetro no método "charAt", para que a cada loop realizado,
	     *  o caracter posterior seja retornado. */
	    
	    for (int i = 0; i < len; i++) {
	      tempCharArray[i] = texto.charAt(i);
	    }
	 
	    /* Inverte a ordem dos caracteres 
	     * 
	     * O iterador "j"  também faz com que o loop seja executado o número de caracteres da String.
	     *  */
	    for (int j = 0; j < len; j++) {
	    	
	    // Ordena o charArray com os items do tempCharArray do último ao primeiro.
	      charArray[j] = tempCharArray[len - 1 - j];
	    }
	 
	    // Converte o array de chars em string.
	    String reverso = new String(charArray);
	    
	    System.out.println(reverso);

	}

}
