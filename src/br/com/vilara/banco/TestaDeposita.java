package br.com.vilara.banco;

import br.com.vilara.banco.conta.ContaCorrente;

public class TestaDeposita {
public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente();
	try {		
		cc.deposita(-100);
	} catch (ValorInvalidoException e) {
		System.out.println(e.getMessage());
	}
}
}
