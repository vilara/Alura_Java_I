package capitulo2;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
	   Data data = new Data();
	   data.ano = 1970;
	   data.dia =  26;
	   data.mes = 3;

		funcionario.nome = "Danilo";
		funcionario.salario = 100;
		funcionario.dataEntrada = data;
		
 funcionario.mostra();

	}

}
