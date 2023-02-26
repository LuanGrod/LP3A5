package ex_03;

public class Triangulo extends FormaGeometrica {

	@Override
	public double calcularArea(int lado) {
		return (lado * lado * Math.sqrt(3)) / 4;
	}

}