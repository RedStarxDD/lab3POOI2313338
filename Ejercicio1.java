package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		//Solicitamos al usuario que ingrese un número entero
		System.out.println("Ingrese un numero entero: ");
		int N = scanner.nextInt();
		
		if (N < 2 || N>20) {
			System.out.println("El numero ingresado no esta en el rango permitido.");
			
		}
	 while (N<2||N>20);
	
		//Imprimimos los 10 multiplos de N
		for (int i =1; i<=10; i++) {
			System.out.println(N+"x"+i+"="+N*i);
			
		}
	

	}

}
