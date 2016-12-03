package br.com.vilara.banco;

import br.com.vilara.banco.conta.ContaCorrente;

public class TesteComparacaoDeContas {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		c1.setNumero(123);
		c2.setNumero(1234);
		c1.setNome("Vilara");
		c2.setNome("Vilara");
		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("Diferentes");
		}

		if (c1.equals(c2)) {
			System.out.println("iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

}
