
package Day1;
import java.util.*;
public class Question3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int[]b= {4,5,6,43,64,33,53,334};
	System.out.print("Enter the value you want to target => ");
	int target=sc.nextInt();
	System.out.println();
 for(int i=0;i<b.length;i++) {
	 if(b[i]==target) {
		 System.out.println("It found at index => "+i);
		 
	 }
 }
}
}
