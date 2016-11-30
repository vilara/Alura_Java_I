package br.com.vilara.calculoarea.modelo;

import br.com.vilara.calculoarea.interfaces.AreaCalculavel;

public class Quadrado implements AreaCalculavel {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}

}
