package Day1;

import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value you ");
	int a= sc.nextInt();
	if(a%2==0) {
		System.out.println("the number is even");
	}else {
		System.out.println("the number is odd");
	}
}
}
