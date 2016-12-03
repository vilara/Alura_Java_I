package br.com.vilara.banco.conta;

import br.com.vilara.banco.ValorInvalidoException;

/**
 * @author MarceloMartinsVilara
 * @param saldo
 *            da conta @
 *
 */
abstract public class Conta {

	public double saldo;
	private int numero;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException("Lançamento de deposito com valores invalidos: " + valor);
		} else {
			this.saldo += valor;
		}
	}

	@Override
	public boolean equals(Object obj) {
		Conta outraconta = (Conta) obj;
		if (this.numero == outraconta.numero || this.nome == outraconta.nome) {
			return true;
		} else {
			return false;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);
}
