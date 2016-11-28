package main;

public class BalancoTrimestral {
public static void main(String[] args) {
	int gastoJaneiro = 1500;
	int gastoFevereiro = 23000;
	int gastoMarco = 17000;
	int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
	System.out.println(gastoTrimestre);
	double mediaMensal = gastoTrimestre/3;
	System.out.println("A média mensal é = "+mediaMensal);
}
}
