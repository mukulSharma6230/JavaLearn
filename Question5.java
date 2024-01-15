package Day1;

import java.util.Scanner;

public class Question5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a= sc.nextLine();
 
 for(int i=a.length()-1;i>=0;i--) {
       System.out.print(a.charAt(i));
 }

}
}
