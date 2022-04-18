import java.util.Scanner;
public class Code2 {
	static void highest_placement(int cs,int ec,int me) {
		if(cs<0 || ec<0 || me<0) {
			System.out.println("Input is invalid");
		}
		else if(cs==ec && ec==me) {
			System.out.println("None of the department has got the highest placement");
		}
		else {
			System.out.println("Highest placement0");
			int maxx=0;
			if(cs>ec && cs>me) {maxx=cs;}
			else if(ec>cs && ec>me) {maxx=ec;}
			else {maxx=me;}
			if(maxx==cs) {System.out.println("CS");}
			if(maxx==ec) {System.out.println("EC");}
			if(maxx==me) {System.out.println("ME");}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of students in CS:");
		int cs=s.nextInt();
		System.out.println("Enter the no od students in EC:");
		int ec=s.nextInt();
		System.out.println("Enter the no of students in ME:");
		int me=s.nextInt();
		highest_placement(cs,ec,me);
	}

}
