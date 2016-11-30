package br.com.vilara.banco.sistema;

import br.com.vilara.banco.interfaces.Tributavel;
public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando conta " + t);
		this.total += t.calculaTributos();

	}

	public double getTotal() {
		return this.total;
	}
}
