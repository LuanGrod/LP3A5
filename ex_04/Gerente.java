package ex_04;

import java.text.DecimalFormat;

public class Gerente extends Funcionario {

	private String senha;

	public Gerente(String nome, double salario, String departamento, String senha) {
		super(nome, salario, departamento);
		this.senha = senha;
	}

	public String mostrarInformacoes() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return "Nome: " + this.getNome() + ", Salario: " + df.format(this.getSalario()) + ", Departamento: "
				+ this.getDepartamento() + ", Senha: " + this.senha + ".";
	}
}
