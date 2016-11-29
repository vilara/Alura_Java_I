package capitulo2;

import capitulo4.Tributavel;

public class TetaTributavel {
public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente();
	cc.deposita(100);
	System.out.println(cc.calculaTributos());
	Tributavel t = cc;
	System.out.println(t.calculaTributos());
}
}
