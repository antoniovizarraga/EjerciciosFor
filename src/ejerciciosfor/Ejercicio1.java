package ejerciciosfor;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n = 0;
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Vamos a aprender a contar. Introduce un número: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
			System.out.println(i);
		
		
		sc.close();
	}

}
