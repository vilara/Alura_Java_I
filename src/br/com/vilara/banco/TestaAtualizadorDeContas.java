package br.com.vilara.banco;

import br.com.vilara.banco.conta.Conta;
import br.com.vilara.banco.conta.ContaCorrente;
import br.com.vilara.banco.conta.ContaPoupanca;
import br.com.vilara.banco.sistema.AtualizadorDeContas;

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
