package br.com.vilara.calculoarea.modelo;

import br.com.vilara.calculoarea.interfaces.AreaCalculavel;

public class Circulo implements AreaCalculavel{

	private double raio;

	@Override
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

}
