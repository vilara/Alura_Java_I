package capitulo2;

import java.util.Date;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
	   Date data = new Date();
	 

		funcionario.nome = "Danilo";
		funcionario.salario = 100;
		funcionario.dataEntrada = data;
		
 funcionario.mostra();

	}

}
