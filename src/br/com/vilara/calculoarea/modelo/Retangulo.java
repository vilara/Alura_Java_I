package br.com.vilara.calculoarea.modelo;

import br.com.vilara.calculoarea.interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel {

	private int altura;
	private int lado;

	@Override
	public double calculaArea() {
		
		return this.lado * this.altura;
	}

	public Retangulo(int altura, int lado) {
		this.altura = altura;
		this.lado = lado;
	}

}
