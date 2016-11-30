package capitulo4;

import java.text.SimpleDateFormat;

import capitulo2.Funcionario;

public class Empresa {
	
	public Empresa (int tamanhoDoArray){
        this.empregados = new Funcionario [tamanhoDoArray];
    }

	String nome;
	int cnpj;
	private Funcionario[] empregados;
	int livre = 0;
	
	public Funcionario getFuncionario (int posicao) {
        return this.getEmpregados()[posicao];
    }

	void adicionar(Funcionario f) {
		this.getEmpregados()[this.livre] = f;
		this.livre++;
	}
	

	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
	void mostraEmpregados() {
		
	/*	  for (Funcionario d : this.empregados) {
		    	System.out.println("Salário: " + d.salario + " Data de admiss�o : " + d.dataEntrada);
	        }*/
		
		for (int i = 0; i < this.getEmpregados().length; i++) {
			if (this.getEmpregados()[i] != null)
				System.out.println("Funcionário na posição: " + this.getEmpregados()[i].getSalario()
						+ " Data de admissão : " + this.getEmpregados()[i]);
			continue;
		}
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}
}
