package ConditionStatement;

public class If_else_ifBlock {

	public static void main(String[] args) {
		char gender = 'M';
		int age = 10;
		if(gender =='F') {
			System.out.println("Free");
		}
		else {
			if(age<=12) {
				System.out.println("Half ticket");
			}
			else if(age >=12 && age <=59) {
				System.out.println("Full ticket");
			}
			else {
				System.out.println("Senior citizen");
			}
		}

	}

}
