package assignment_4;
import java.util.Scanner;
public class Rohit_assignment_4_1 {
	static int cal_increment(int sal,float rating) {
		int inc=0;
		if(rating >=1 && rating <= 4) {
			inc=10;
		}
		else if(rating >= 4.1 && rating <=7) {
			inc=25;
		}
		else {
			inc=30;
		}
		int inc_sal=sal+(sal*inc/100);
		return inc_sal;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		int sal=sc.nextInt();
		System.out.println("Enter the appraisal rating");
		float rating= sc.nextFloat();
		if(rating<1 || rating>10 || sal<0) {
			System.out.println("Invalid");
		}else {
			System.out.println(cal_increment(sal,rating));
		}
	}

}
