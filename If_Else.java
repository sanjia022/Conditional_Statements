package ConditionStatement;

import java.util.Scanner;

/*Assignment 14 
WAP if age is greater than or equals to 18 then you can vote
else you can not vote
 * */

public class If_Else {
	
	public static void main(String[] args) {
		
		int eligibleAge = 18;
		System.out.println("Enter your age:");
		Scanner scanner = new Scanner (System.in);
		int age  = scanner.nextInt();
		if(age >= eligibleAge) {
			System.out.println("You can vote");
		}else {
			System.out.println("You can not vote");
		}
		scanner.close();
		
		
		
	}

}
