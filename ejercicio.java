package test;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primero se declara una variable "count" que es igual a 1.
		int count = 1;
		// Luego se inicia un buble "while" con la condicion "count < 10",count debe ser menor a 10.
		while ( count < 10 )
		{
		// Finalmente se usa el println para imprimir y nos va a dar como resultado un bucle infinito.			
			System.out.println(count + " "+ Math.sqrt(count));
			count++;
		}
	}

}
