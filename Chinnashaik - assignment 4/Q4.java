package Assignment4;
import java.util.Scanner;
import java.lang.Math;
public class Assignment4question4 {


	static void sum(int low,int high) {
		int even=0,odd=0,abs=0;
		for(int i=low;i<=high;i++) {
			if(i%2==0) {even=even+i;}
			else {odd=odd+i;}
		}
		abs=Math.abs(even-odd);
		System.out.println("The Sum of odd numbers from "+low+" to "+high+" is:"+odd);
		System.out.println("The Sum of even numbers from "+low+" to "+high+" is:"+even);
		System.out.println("The absolute difference between the two sums is: "+abs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int low=s.nextInt();
		int high=s.nextInt();
		sum(low,high);
	}

}
