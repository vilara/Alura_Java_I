package capitulo2;

public class Funcionario {
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
void mostra() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Departamento: " + this.departamento);
    System.out.println("Salário: " + this.salario);
    System.out.println("Data Entrada: " + this.dataEntrada);
    System.out.println("Rg: " + this.rg);
    System.out.println("Nome: " + this.calculaGanhoAnual());
}
}
