import java.util.Scanner;
public class Fibonacci {

	public static void main(String args[]){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++){			
				c=a+b;
				if(c<n){
					System.out.println(c);
				}
				a=b;
				b=c;
		}
	}
}
