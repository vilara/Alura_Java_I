package main;

public class NumeroFatorial {
public static void main(String[] args) {
	int numero = 1;
	
	while (numero <=30) {
		long fatorial  =  1;
		for (int i = numero; i > 0; i--) {
			
			fatorial = fatorial*i;
		}
		System.out.println("O fatorial de "+numero+ " é "+fatorial);
		numero++;
	}
}
}
