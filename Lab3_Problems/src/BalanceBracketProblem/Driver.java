package BalanceBracketProblem;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Enter the Input");
		input = sc.next();
		if(BalanceBracketSolution.CheckBalance(input))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
		sc.close();

	}

}
