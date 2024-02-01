package macpackage2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Format {

	static int getnum(String promt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(promt + ">> ");
		return scan.nextInt();
	}

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);

		try {

			int num1 = getnum("Num 1 ");
			int num2 = getnum("Num 2 ");
//		System.out.print("ACCEPT NUMBER: ");
//		int num1 = scan.nextInt();
//		
//		System.out.print("ACCEPT NUMBER: ");
//		int num2 = scan.nextInt();

			System.out.format("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.format("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.format("%d / %d = %d\n", num1, num2, num1 / num2);
			System.out.format("%d * %d = %d\n", num1, num2, num1 * num2);
		} catch (ArithmeticException ac) {
			System.out.println("ArithmeticException ERROR OCCURRED" + ac.getMessage());
		} catch (InputMismatchException ac) {
			System.out.println("InputMismatchException ERROR OCCURRED " + ac.getMessage());
//		} catch (Exception ac) {
//			System.out.println("Exception ERROR OCCURRED" + ac.getCause());
		}
		System.out.println("END");

	}

}
