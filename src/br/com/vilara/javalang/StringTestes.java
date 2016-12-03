package br.com.vilara.javalang;

public class StringTestes {
	public void escreveCaracter(String nome){
		
		int tamanho = nome.length();
		for (int i = 0; i < tamanho; i++) {
			System.out.println(nome.charAt(i));
		}
	}
	
public void escreveCaracterTrasParaFrente(String nome){
		
		int tamanho = nome.length();
		for (int i = tamanho; i > 0; i--) {
			System.out.print(nome.charAt(i - 1));
		}
	}


public void escreveCaracterTrasParaFrenteBuider(StringBuilder nome){
	
		System.out.print(nome.reverse());
}

public void escrevePalavrasTrasParaFrente(String nome){
	String[] palavras = nome.split(" ");	
	int tamanho = palavras.length;
	for (int i = tamanho - 1; i >= 0; i--) {
		System.out.print(palavras[i]+" ");
		
	}
}
	
}
