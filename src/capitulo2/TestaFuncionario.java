package capitulo2;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		Funcionario funcionario2 = new Funcionario();

		funcionario.nome = "Danilo";
		funcionario.salario = 100;

		funcionario2.nome = "Danilo";
		funcionario2.salario = 100;

		if (funcionario == funcionario2) {
			System.out.println("iguais");

		} else {
			System.out.println("diferentes");
		}
	}

}
