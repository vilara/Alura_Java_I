package capitulo4;

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
