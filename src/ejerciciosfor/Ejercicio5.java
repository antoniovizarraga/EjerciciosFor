package ejerciciosfor;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			n += sc.nextInt();
		}
			
		n = n / 10;
		
		System.out.println("La media es: " + n);
		
		sc.close();
	}

}
