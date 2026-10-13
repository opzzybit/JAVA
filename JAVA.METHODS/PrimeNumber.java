import java.util.Scanner;

    public class PrimeNumber {
    
     public static boolean isPrimeNumber(int number){

 if (number % 2 != 0 && number % number == 2){
      return true;
}
  else{
       return false;
}
 }
      public static void main(String [] args ){
      
    Scanner inputOpzzybit = new Scanner (System.in);
    
    System.out.println("Enter a number :");
      int  primeNumber = inputOpzzybit.nextInt();
      
  boolean output = isPrimeNumber(primeNumber);
  System.out.println(output);
}
}
    
    
    
    
    
    
    
