package Assignment4;
import java.util.*;
import java.lang.Math;
public class sumoddeven {
	public static long[] oddevensum (int a,int b) {
		long oddsum=0,evensum=0;
		int i;
		for(i=a;i<=b;i++) {
			if(i%2==0) {
				evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		return new long[]{evensum,oddsum};
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int a=sc.nextInt();
		System.out.print("Enter ending number: ");
		int b=sc.nextInt();
		long[] arr=oddevensum(a,b);
		System.out.println("The sum of even numbers from "+(a)+" to "+(b)+" is "+ arr[0]);
		System.out.println("The sum of odd numbers from "+(a)+" to "+(b)+" is "+ arr[1]);
		System.out.println("The sum of odd numbers from "+(a)+" to "+(b)+" is "+ Math.abs(arr[1]-arr[0]));
		
		

	}

}