package capitulo2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {


	public Funcionario() {
		this.incrementaIdentificador();
	}

	public Funcionario(String nome) {
		this();
		this.nome = nome;
	}
	
	public static int getIdentificador() {
		return identificador;
	}
	
	private static int identificador;
	private String nome;
	private String departamento;
	private double salario;
	private Date dataEntrada;
	private String rg;
	private double ganhoAnual;
	
	public void incrementaIdentificador(){
		this.identificador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getGanhoAnual() {
		return ganhoAnual;
	}

	public void setGanhoAnual(double ganhoAnual) {
		this.ganhoAnual = ganhoAnual;
	}

	public void recebeAumento(double valor) {
		this.salario += valor;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");

		return formatador.format(dataEntrada);
	}

	public void mostra() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Data Entrada: " + this.getDataEntrada().getTime());
		System.out.println("Rg: " + this.getRg());
		System.out.println("Nome: " + this.calculaGanhoAnual());
	}

}
