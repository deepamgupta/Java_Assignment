public class DiamondPattern
{ 	 
	public static void main(String args[]) 
	{ 
		int n=5; 
		int space = n - 1;  
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < space; j++) 
				System.out.print(" "); 
			for (int j = 0; j <= i; j++) 
				System.out.print("* "); 
	
			System.out.print("\n"); 
			space--; 
		} 
		space = 1; 
		for (int i = n-1; i > 0; i--) 
		{ 
			for (int j = 0; j < space; j++) 
				System.out.print(" "); 
			for (int j = 0; j < i; j++) 
				System.out.print("* "); 
			System.out.print("\n"); 
			space++; 
		}
		
	} 
} 

