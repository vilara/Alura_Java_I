package capitulo2;

import capitulo4.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}

}
