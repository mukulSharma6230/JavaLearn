package Day1;

import java.util.Scanner;

public class Question8 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String b= sc.nextLine();
	int i=0;
	String m="";
	while( i<b.length()) {
		if(b.charAt(i)==' ') {
			i++;

		}
		m +=b.charAt(i);
		i++;
	
		
	}
	System.out.println("Enter " +m);
}
}
