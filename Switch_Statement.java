package ConditionStatement;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Switch_Statement {

	public static void main(String[] args) {
		System.out.println("Please enter the score");
		Scanner scanner = new Scanner(System.in);
		try{int score = scanner.nextInt();
		
		switch(score)
		{
			case(45):System.out.println("hdskfh");
			        break;
			case(75):System.out.println("hdskfh");
	        break;
			case(54):System.out.println("hdskfh");
	        break;
	        default: System.out.println("duj");
		}
		}
		catch(InputMismatchException e) {
			
		}

	}

}
