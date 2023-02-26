package ex_04;

import java.text.DecimalFormat;

public class Funcionario {

	private String nome;
	private double salario;
	private String departamento;

	public Funcionario(String nome, double salario, String departamento) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String mostrarInformacoes() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return "Nome: " + this.nome + ", Salario: " + df.format(this.salario) + ", Departamento: " + this.departamento
				+ ".";
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
