package calc;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("donnez un calcul : ");
		String calcul = sc.nextLine();
		String regSign = "[*\\-+/]";
		String regNum = "[0-9]+";
		sc.close();
		calcul = calcul.replaceAll("[ ]", "");
		String[] splittedNum = splitter(calcul, regSign);
		String[] splittedSign = splitter(calcul, regNum);
		Double firstNumber = Double.parseDouble(splittedNum[0]);
		for (int i = 1; i < splittedNum.length; i++) {
			switch (splittedSign[i]) {
			case "+":
				firstNumber = addition(firstNumber, Double.parseDouble(splittedNum[i]));
				break;
			case "-":
				firstNumber = soustraction(firstNumber, Double.parseDouble(splittedNum[i]));
				break;
			case "*":
				firstNumber = multiplication(firstNumber, Double.parseDouble(splittedNum[i]));
				break;
			case "/":
				firstNumber = division(firstNumber, Double.parseDouble(splittedNum[i]));
				break;
			default:
				System.out.println("Signe non reconnu");
				break;
			}

		}
		System.out.println("le résultat du calcul est de : " + firstNumber);
	}

	// Reconnaissance des signes

	public static Double addition(Double a, Double b) {
		return a + b;
	}

	public static Double division(Double a, Double b) {
		try {
			return a / b;

		} catch (ArithmeticException e) {
			System.out.println("impossible de diviser par 0");
			return null;
		}
	}

	public static Double multiplication(Double a, Double b) {
		return a * b;
	}

	public static Double soustraction(Double a, Double b) {
		Double c = a - b;
		return c;
	}

	public static String[] splitter(String toSplit, String reg) {
		return toSplit.split(reg);
	}
}
