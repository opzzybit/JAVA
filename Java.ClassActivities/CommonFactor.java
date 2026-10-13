import java.util.Scanner;
   public class CommonFactor{
      public static void main (String [] args){
       
       Scanner input = new Scanner (System.in);
      
      System.out.println("Enter any number");
       int number = input.nextInt();
      
   for (int index = 1; index <= number; index++){
 
   if(number % index == 0){
    
      System.out.println(index);
}
  }
    }
      }
      
