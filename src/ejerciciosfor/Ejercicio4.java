package ejerciciosfor;
import java.util.Scanner;

public class Ejercicio4 {
	
	
	public static void main(String[] args) {
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
			System.out.println("3 x " + i + " = " + 3 * i);

		sc.close();
	}

}
