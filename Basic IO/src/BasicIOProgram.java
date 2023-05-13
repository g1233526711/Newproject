
import java.util.Scanner;

public class BasicIOProgram {

	public static void main (String [] arg) {
		
		System.out.println (" Program Add and Average Number");
		
		Scanner leer = new Scanner(System.in);
		int num1 = 0, num2= 0, num3 = 0, result = 0;
		double average = 0.0;
		
		System.out.println (" Type the First Number : ");
		num1 = leer.nextInt();
		
		System.out.println (" Type the Second Number : ");
		num2 = leer.nextInt();
		
		System.out.println (" Type the Third Number : ");
		num3 = leer.nextInt();
		
		result = num1 + num2 + num3;
		average = result / 3.0;
		
		System.out.println (" The Sum of the Number is : " + result);
		System.out.println (" The Average of the Number is : " + average);
		
		leer.close();
		
	}
}
