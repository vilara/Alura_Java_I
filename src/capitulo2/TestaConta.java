package capitulo2;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		conta.deposita(1000);
		contaCorrente.deposita(1000);
		contaPoupanca.deposita(1000);
		contaCorrente.saca(2000);

		conta.atualiza(0.01);
		contaCorrente.atualiza(0.01);
		contaPoupanca.atualiza(0.01);
		System.out.println(conta.getSaldo());
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
	}

}
