import java.util.Arrays; 
public class SortArray {
public static void main(String args[]){   
    int[] my_array1 = {
            17, 20, 18, 14, 20, 
            14, 24};
    String[] my_array2 = {
            "Java",			
            "Python",
            "PHP",
            "C#",
            "ruby",
            "C++"
        };        
	    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
	    Arrays.sort(my_array1);
	    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
	    System.out.println();
	    System.out.println("Original string array : "+Arrays.toString(my_array2));
	    Arrays.sort(my_array2);
	    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}