//Calculate how many characters are in the upper case and how many character in the lower case
package Day1;
import java.util.Scanner;
public class Question2 {
public static void main(String[] args) {
	int CapsCount=0;
	int SmallCounts=0;
	System.out.print("Enter the words: ");
	Scanner sc = new Scanner(System.in);
	String a=sc.nextLine();
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)>='A'&& a.charAt(i)<='Z') {
			CapsCount++;
		}else if(a.charAt(i)>='a'&& a.charAt(i)<='z') {
			SmallCounts++;
		}
		}
	if(a.length()==0){
		System.out.println("No words are present");
	}
	System.out.println("the letters present in the upperCase :="+CapsCount +" and small letters := "+SmallCounts);
}
}
