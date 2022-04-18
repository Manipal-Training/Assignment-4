import java.util.Scanner;
public class Code3 {
	static void prime_num(int low,int high) {
		if(low>=high) {
			System.out.println("Provide valid input");
		}
		else {
			if(low==1) {low++;}
			for(int i=low;i<=high;i++) {
				int count=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {count++;}
				}
				if(count==0) {System.out.print(i+" ");}
			}
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int low=s.nextInt();
		int high=s.nextInt();
		prime_num(low,high);
	}
}
