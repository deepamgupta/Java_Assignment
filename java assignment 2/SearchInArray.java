import java.util.Scanner;
public class SearchInArray {
	public static void main(String args[]) {
		int arr[]={11,76,90,32,28,99};
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to e search in array ");
		x=s.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				System.out.println("Number is found at index " + i);
				System.exit(0);
			}
		}
		System.out.println("Number not found");

	}

}
