package util;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatch extends Exception{
	Scanner scan = new Scanner(System.in);
	int a;
	public int exep() {
		
		try{
			a = scan.nextInt();

		}
		catch(InputMismatchException e) {
			scan.next();
			//e.printStackTrace();
			System.out.println("���ڸ� �Է��� �ּ���.");
			exep();
			
			
		}
			return a;
	}




}
