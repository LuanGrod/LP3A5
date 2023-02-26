package ex_03;

public class Circulo extends FormaGeometrica {

	@Override
	public double calcularArea(int lado) {
		return Math.PI * lado * lado;
	}

}
