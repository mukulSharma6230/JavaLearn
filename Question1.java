// calaculate the number of character present in the string and not calculate  space in it
// name was given by the Users

package Day1;
 import java.util.*;
public class Question1 {
 public static void main(String[] args) {
	 int count =0;
	 int space =0;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the String that you want to enter");
	 String a= sc.nextLine();
	 for(int i=0;i<a.length();i++) {
		 if(a.charAt(i)==' ') {
			 space ++;
		 }else {
			 count++;
		 }
		
	 }
	 System.out.println("the number of character present in this are "+count +" and space betweeen them "+space);
}
}
