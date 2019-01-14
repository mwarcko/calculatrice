package calc;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("donnez un calcul : ");
		String calcul = sc.nextLine();
		String regSign = "[*\\-+\\/]";
		String regNum = "[0-9]+";

		String[] splittedNum = splitter(calcul, regSign);
		String[] splittedSign = splitter(calcul, regNum);

		for (int i = 0; i < splittedNum.length; i++) {
			System.out.println("numéro [" + i + "]" + splittedNum[i]);
		}

		for (int i = 0; i < splittedSign.length; i++) {
			System.out.println("signe: [" + i + "]" + splittedSign[i]);
		}

		// Reconnaissance des signes
	}

	public Integer addition(Integer a, Integer b) {
		return a + b;
	}

	public Integer division(Integer a, Integer b) {
		return a / b;
	}

	public Integer multiplication(Integer a, Integer b) {
		return a * b;
	}

	public Integer soustraction(Integer a, Integer b) {
		return a - b;
	}

	public static String[] splitter(String toSplit, String reg) {
		return toSplit.split(reg);
	}
}
