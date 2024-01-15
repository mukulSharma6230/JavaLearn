package Day1;

import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the factorial of the number you want => ");
	int number = sc.nextInt();
	int fact=1;
	for(int i=1;i<=number;i++) {
		fact = fact*i;
	}
	System.out.println("Factorial of the number is:=> "+fact);
}
}
