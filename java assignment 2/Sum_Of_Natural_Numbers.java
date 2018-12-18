public class Sum_Of_Natural_Numbers {
    public static void main(String args[]) {
        Sum_Of_Natural_Numbers obj=new Sum_Of_Natural_Numbers();        
        System.out.println("Sum of natural numbers upto 100 by For loop " + obj.sumByForLoop());
        System.out.println("Sum of natural numbers upto 100 by While loop " + obj.sumByWhileLoop());
        System.out.println("Sum of natural numbers upto 100 by For loop " + obj.sumByForLoop());
    }
    public int sumByForLoop(){
        int sum=0;
        for(int i=1; i<=100; i++){
            sum+=i;
        }    
        return sum;
    }
    public int sumByWhileLoop(){
        int sum=0,i=1;
        while(i<=100){
            sum+=i;
            i++;
        }
        return sum;
    }  
    public int sumByDoWhileLoop(){
        int sum=0,i=1; 
        do{
            sum+=i;
            i++;
        }while(i<=100);    
        return sum;
    }
}
