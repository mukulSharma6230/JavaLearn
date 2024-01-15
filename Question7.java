package Day1;

import java.util.Scanner;

public class Question7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String b= sc.nextLine();
	int count =0;
	int i=0;
	int j= b.length()-1;
	while(i<j) {
		if(b.charAt(i)!=b.charAt(j)) {
			count =1;
			break;
		}
		i++;j--;
	}
	if(count ==1) {
		System.out.println("The number is not palindrome");
	}else {
		System.out.println("the number is palindrome");
	}
}
}
