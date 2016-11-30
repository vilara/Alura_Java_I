package br.com.vilara.banco.conta;

import br.com.vilara.banco.ValorInvalidoException;



/**
 * @author MarceloMartinsVilara
 * @param saldo da conta
 * @
 *
 */
abstract public class Conta {

	public double saldo;

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

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);
}
