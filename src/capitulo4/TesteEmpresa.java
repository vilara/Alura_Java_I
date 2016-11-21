package capitulo4;

import java.util.Date;

import capitulo2.Funcionario;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		f1.dataEntrada = new Date();
		empresa.adicionar(f1);

		Funcionario f2 = new Funcionario();
		f2.salario = 1006;
		f2.dataEntrada = new Date();
		empresa.adicionar(f2);
		
		empresa.mostraEmpregados();
	}

}
