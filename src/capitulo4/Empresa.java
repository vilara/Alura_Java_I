package capitulo4;

import java.text.SimpleDateFormat;

import capitulo2.Funcionario;

public class Empresa {
	String nome;
	int cnpj;
	Funcionario[] empregados;
	int livre = 0;

	void adicionar(Funcionario f) {
		this.empregados[this.livre] = f;
		this.livre++;
	}
	

	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
	void mostraEmpregados() {
		
	/*	  for (Funcionario d : this.empregados) {
		    	System.out.println("Sal�rio: " + d.salario + " Data de admiss�o : " + d.dataEntrada);
	        }*/
		
		for (int i = 0; i < this.empregados.length; i++) {
			if (this.empregados[i] != null)
				System.out.println("Funcion�rio na posi��o: " + this.empregados[i].salario
						+ " Data de admiss�o : " + this.empregados[i]);
			continue;
		}
	}
}
