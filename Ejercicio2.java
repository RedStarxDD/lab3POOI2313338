package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numeroActual, cantidadNumeros=0, suma=0, promedio=0;
		Boolean calcularPromedio=true;
		
		while (calcularPromedio && sc.hasNextInt()) {
			numeroActual=sc.nextInt();
			
			if(numeroActual<0) {
				System.out.println("El número ingresado fue negativo. Se finaliza el programa");
				calcularPromedio=false;
				sc.close();
			} else {
				cantidadNumeros++;
				suma+=numeroActual;
				promedio=suma/cantidadNumeros;
				
				System.out.println("La suma total de los "+cantidadNumeros+" números ingresados es: "+suma);
				System.out.println("El promedio de los "+cantidadNumeros+" números ingresados es: "+promedio);						
			}			
		}
	}

}
