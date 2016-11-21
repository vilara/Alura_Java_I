package capitulo2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
public String nome;
public String departamento;
public double salario;
public Date dataEntrada;
public String rg;
public double ganhoAnual;
public void recebeAumento(double valor){
	this.salario += valor;
}
public double calculaGanhoAnual(){
	return this.salario*12;
}


@Override
public String toString() {
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
	
	return  formatador.format(dataEntrada) ;
}

public void mostra() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Departamento: " + this.departamento);
    System.out.println("Salário: " + this.salario);
    System.out.println("Data Entrada: " + this.dataEntrada.getTime());
    System.out.println("Rg: " + this.rg);
    System.out.println("Nome: " + this.calculaGanhoAnual());
}
}
