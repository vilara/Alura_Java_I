package br.com.vilara.banco.sistema;

import br.com.vilara.banco.conta.Conta;

public class AtualizadorDeContas {
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	private double saldoTotal = 0;

	private double selic;

	

	public void roda(Conta c) {
		System.out.println("Saldo anterior = "+ c.getSaldo());
		c.atualiza(this.selic);
		this.saldoTotal += c.getSaldo();
		System.out.println("Saldo atualizado = "+ c.saldo);
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
