package ejercicios;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		int i = 0;
		do {
		    int x = 2 * i - 10;
		    if (x < 0)
		        x = (-1) * x;
		    int y = 0;
			System.out.println(x + " " + y); // Reemplaza 'y' con el valor adecuado
		    i++;
		} while (i < 10);
	
		}
	

}
