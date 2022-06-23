package main.com.teste;

public class questao5 {

	public static void main(String[] args) {
				
		String texto = "Esse texto vai ser invertido";
	    int len = texto.length();
	    char[] tempCharArray = new char[len];
	    char[] charArray = new char[len];
	 
	    /* Separa os caracteres da String em um Array de Chars
	     * 
	     * O iterador "i" faz com que o loop "for" seja executado o exato n�mero de caracteres da String.
	     * 
	     * Al�m disso, ele tamb�m � usado como par�metro no m�todo "charAt", para que a cada loop realizado,
	     *  o caracter posterior seja retornado. */
	    
	    for (int i = 0; i < len; i++) {
	      tempCharArray[i] = texto.charAt(i);
	    }
	 
	    /* Inverte a ordem dos caracteres 
	     * 
	     * O iterador "j"  tamb�m faz com que o loop seja executado o n�mero de caracteres da String.
	     *  */
	    for (int j = 0; j < len; j++) {
	    	
	    // Ordena o charArray com os items do tempCharArray do �ltimo ao primeiro.
	      charArray[j] = tempCharArray[len - 1 - j];
	    }
	 
	    // Converte o array de chars em string.
	    String reverso = new String(charArray);
	    
	    System.out.println(reverso);

	}

}
