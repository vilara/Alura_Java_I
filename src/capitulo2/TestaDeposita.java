package capitulo2;

public class TestaDeposita {
public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente();
	try {		
		cc.deposita(-100);
	} catch (ValorInvalidoException e) {
		System.out.println(e.getMessage());
	}
}
}
