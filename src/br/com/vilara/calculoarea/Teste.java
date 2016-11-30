package br.com.vilara.calculoarea;

import br.com.vilara.calculoarea.interfaces.AreaCalculavel;
import br.com.vilara.calculoarea.modelo.Circulo;
import br.com.vilara.calculoarea.modelo.Retangulo;

public class Teste {

	public static void main(String[] args) {
      AreaCalculavel a = new Retangulo(3, 2);
      System.out.println("A área é de :"+ a.calculaArea());
      
      AreaCalculavel c = new Circulo(5);
      System.out.println("A área do círculo é: "+c.calculaArea());
	}

}
