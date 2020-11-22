package cuentaApp;

public class Ejecutable {

	public static void main(String[] args) {
		Cuenta cuenta_1 = new Cuenta("Nestor", 2000);
		Cuenta cuenta_2 = new Cuenta("Lucas", 0);
		
		cuenta_1.ingresar(340);
		cuenta_2.ingresar(500);
		
		cuenta_1.retirar(700);
		cuenta_2.retirar(337);
		
		System.out.println(cuenta_1);
		System.out.println(cuenta_2);
	}

}
