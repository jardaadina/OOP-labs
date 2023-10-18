package lab2;

import java.util.Scanner;

public class MsinClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputValue = input.nextInt();

//		System.out.println("valoarea citita de la tastatura este " +inputValue);

		int maxInt = Integer.MAX_VALUE;
		System.out.println(maxInt + 1);

		int minInt = Integer.MIN_VALUE;
		System.out.println(minInt - 1);

		float maxFloat = Float.MAX_VALUE;
		System.out.println(maxFloat * 3);

		try {
			System.out.println(maxInt / inputValue);
		} catch (ArithmeticException exception) {
			System.out.println("ai intodus o valoare gresita, introdu alta valoare ");
			inputValue = input.nextInt();
		}
		System.out.println("noua valoare: " + inputValue);

		// boolean a=5;
		// int b=3.4;
	}

}
