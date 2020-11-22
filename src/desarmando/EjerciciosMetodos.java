package desarmando;

public class EjerciciosMetodos {

	public static void main(String[] args) {
		double circulo;
		double radio = 3;
		double PI = 3.1416;
		double base = 4;
		double altura = 3;
		double lado = 4;
		double resultado = areaTriangulo(base, altura);
		double resultado2 = areaCirculo (radio, PI);
		double resultado3 = areaCuadrado (lado);
		
		System.out.println("El area del triángulo es " + resultado);
		System.out.println("El area del Circulo es " + resultado2);
		System.out.println("El area del Cuadrado es " + resultado3);
	}

	private static double areaCuadrado(double lado) {
		
		return (lado * lado);
	}

	private static double areaCirculo(double radio, double PI) {
		return (radio * radio * PI);
	}

	private static double areaTriangulo(double base, double altura) {
		
		return  (base * altura) / 2;
	}

}
