package br.com.vilara.javalang;

public class TetaInteger {
	

	
public static void main(String[] args) {
	Integer x = new Integer(10);
	Integer y = new Integer(10);
	int r = x.parseInt("22");
	int l = x.parseInt("22");
	if (x ==y) {
	 System.out.println("igual");	
	}else{
		System.out.println("Diferente");
	}
	
	StringTestes testestring = new StringTestes();
	//testestring.escreveCaracter("Alura");
	
	StringBuilder pal = new StringBuilder("Anotaram a data da Maratona");
	
	testestring.escreveCaracterTrasParaFrenteBuider(pal);
	
	//testestring.escrevePalavrasTrasParaFrente("Socorram-me, subi no ônibus em Marrocos");
}
}
