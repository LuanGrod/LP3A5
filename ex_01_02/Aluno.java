package ex_01_02;

public class Aluno extends Pessoa {

	private String matricula;

	public Aluno(String nome, int idade, String matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}

	public String apresentar() {
		return "Olá, eu sou " + this.getNome() + " com matricula " + this.matricula + " e tenho " + this.getIdade()
				+ " anos.";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
