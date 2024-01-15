package Day1;

import java.util.Scanner;

public class Question10 {
public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  int []a= {1,2,3,4,5,6,7,8,9};
  
 for(int i=0;i<a.length/2;i++) {
	 int temp=a[i];
	 a[i]=a[a.length-i-1];
	 a[a.length-i-1]=temp;
 }
 for(int k=0;k<a.length;k++) {
	 System.out.print(a[k]+" ");
 }
}
}
