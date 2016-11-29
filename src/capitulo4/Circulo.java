package capitulo4;

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
