package Laboratorio;

public class Ejercicio5 {

			public static void main(String[] args) {
				    // 	Se inicia con una variable en 0. Después, entra a un buble for que se ejecutará i hasta el 9.
				for  (int i = 0; i< 10; i++){
					// Se inicia una variable x en 2 más el valor de i menos 10.
					int x = 2 * i-10;
					// Se verifica si x es menor que 0.
					if (x< 0)
					// Se le resta 1 a x para que sea igual a (-1)+x
					x= (-1)* x;
					// Se da un valor 0
						int y=0;
					// Finalmente se imprime para que nos brinde el resultado del buble junto con y.
						System.out.println(x+ " "+y);

						
				}
		    
	}

}
