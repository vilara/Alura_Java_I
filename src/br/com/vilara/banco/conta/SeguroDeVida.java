package br.com.vilara.banco.conta;

import br.com.vilara.banco.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}

}
