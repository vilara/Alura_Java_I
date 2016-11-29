package capitulo2;

public class TestaGerenciadorDeImpostoDeRenda {
public static void main(String[] args) {
	GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
	SeguroDeVida s = new SeguroDeVida();
	g.adiciona(s);
	ContaCorrente cc = new ContaCorrente();
	cc.deposita(1000);
	g.adiciona(cc);
	System.out.printf("O saldo é: %.2f", g.getTotal());
}
}
