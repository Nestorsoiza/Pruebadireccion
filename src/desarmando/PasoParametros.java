package desarmando;

public class PasoParametros {

	public static void main(String[] args) {

		int a = 5;
		int num [] = new int[3];
		metodoA(a);
		
		System.out.println("La variable a sigue valiendo " + a);
		
		rellenarArray(num);
		System.out.println("El primer valor del array es " + num[0]);
		System.out.println("El segundo valor del array es " + num[1]);
		System.out.println("El tercer valor del array es " + num[2]);
		
	}

	private static void rellenarArray(int num[]) {
		System.out.println("Dentro del metodo, la direccion del array es " + num);
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		
	}

	private static void metodoA(int a) {
		a = 15;
		
	}

}
