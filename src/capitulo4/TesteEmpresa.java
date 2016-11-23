package capitulo4;

import java.util.Date;

import capitulo2.Funcionario;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(10);
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		f1.setDataEntrada(new Date());
		empresa.adicionar(f1);

		Funcionario f2 = new Funcionario();
		f2.setSalario(1006);
		f2.setDataEntrada(new Date());
		empresa.adicionar(f2);
		
		empresa.mostraEmpregados();
		System.out.println("N�mero de funcion�rios cadastrados: " + Funcionario.getIdentificador());
	}

}
