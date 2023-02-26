package ex_01_02;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String apresentar() {
		return "Ol�, eu sou " + this.nome + " e tenho " + this.idade + " anos.";
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
