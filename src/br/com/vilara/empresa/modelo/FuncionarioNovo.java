package br.com.vilara.empresa.modelo;

public class FuncionarioNovo {
String nome;
String departamento;
double salario;
String dataEntrada;
String rg;
double ganhoAnual;
void recebeAumento(double valor){
	this.salario += valor;
}
double calculaGanhoAnual(){
	return this.salario*12;
}
}
