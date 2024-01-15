package Day1;

import java.util.Scanner;

public class Question9 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	int b=sc.nextInt();
	int temp =a;
	a=b;
	b=temp;
	System.out.println("so that value changes and the value  of a "+a+ " and the value of  b "+b);
}
}
