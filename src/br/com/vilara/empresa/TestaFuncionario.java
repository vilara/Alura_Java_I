package br.com.vilara.empresa;

import java.util.Date;

import br.com.vilara.empresa.modelo.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
	   Date data = new Date();
	 

		funcionario.setNome("Danilo");
		funcionario.setSalario(100);
		funcionario.setDataEntrada(data);
		
 funcionario.mostra();

	}

}
