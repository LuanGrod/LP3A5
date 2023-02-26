package poo;

import java.text.DecimalFormat;

import ex_01_02.Aluno;
import ex_01_02.Pessoa;
import ex_03.Circulo;
import ex_03.Quadrado;
import ex_03.Triangulo;
import ex_04.Funcionario;
import ex_04.Gerente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p = new Pessoa("John Doe", 12);

		// System.out.println(p.getNome());

		Aluno a = new Aluno("John Doe", 12, "sp1234567");

		// System.out.println(a.getMatricula());

		Circulo c = new Circulo();

		DecimalFormat df = new DecimalFormat("#.00");

		// System.out.println(df.format(c.calcularArea(3)));

		Triangulo t = new Triangulo();

		// System.out.println(df.format(t.calcularArea(3)));

		Quadrado q = new Quadrado();

		// System.out.println(df.format(q.calcularArea(3)));

		Funcionario f = new Funcionario("John", 100000, "RH");

		// System.out.println(f.mostrarInformacoes());

		Gerente g = new Gerente("John", 100000, "RH", "123");

		System.out.println(g.mostrarInformacoes());
	}

}
