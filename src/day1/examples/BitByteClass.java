package day1.examples;

import java.util.Scanner;

public class BitByteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>b){
			System.out.println("Value a is greater than b");
		}else if (a>c){
			System.out.println("a is greater than c");
		}else {
			System.out.println("c is greater than c");
		}
			
				
		
		//System.out.println(a);

	}
	*/
		
		 int testscore = 76;
	        char grade;

	        if (testscore >= 90) {
	            grade = 'A';
	        } else if (testscore >= 80) {
	            grade = 'B';
	        } else if (testscore >= 70) {
	            grade = 'C';
	        } else if (testscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Grade = " + grade);
	    }


}
