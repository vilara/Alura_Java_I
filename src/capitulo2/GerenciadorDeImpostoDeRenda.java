package capitulo2;

import capitulo4.Tributavel;

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
