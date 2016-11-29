package capitulo2;

public class TestaAtualizadorDeContas {
public static void main(String[] args) {
	Conta conta = new ContaCorrente();
	ContaCorrente contaCorrente = new ContaCorrente();
	ContaPoupanca contaPoupanca = new ContaPoupanca();
	conta.deposita(1000);
	contaCorrente.deposita(1000);
	contaPoupanca.deposita(1000);
	AtualizadorDeContas a = new AtualizadorDeContas(0.01);
	a.roda(conta);
	a.roda(contaCorrente);
	a.roda(contaPoupanca);
	System.out.println("O Saldo total é = "+ a.getSaldoTotal());
}
}
