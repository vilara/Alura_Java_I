package capitulo2;

abstract public class Conta {

protected double saldo;

public double getSaldo() {
	return saldo;
}

public void deposita(double valor){
	this.saldo += valor;
}
public void saca(double valor){
	this.saldo-=valor;
}
public abstract void atualiza(double taxa);
}
