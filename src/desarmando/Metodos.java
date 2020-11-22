package desarmando;

public class Metodos {

	public static void main(String[] args) {
		int operador1 = 3;
        int operador2 = -5;
       boolean resultado = sumaNumeros(operador1, operador2);
        
       if (resultado) {
       	System.out.println("El numero es positivo");
      	
		} else {
       	System.out.println("El numero es negativo");

		}

	}
	
	public static boolean sumaNumeros (int num1, int num2){

        int resultado = num1 + num2;
        
        if (resultado > 0) {
        	return true;
			
		} else {

		}
		return false;

    }



}