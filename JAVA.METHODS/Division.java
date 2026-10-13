import java.util.Scanner;

   public class Division{
   
   
   public static int division(int integer1, int integer2){
   
    int calculation = integer1 / integer2; 
          return calculation;
}
    public static void main(String [] opzzy){
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("Enter first number :");
      int number1 = input.nextInt();
    
    System.out.println("Enter second number :");
      int number2 = input.nextInt();
 
 float result = division(number2, number1);
 
  System.out.println("The answer is "  + result);


}
  }

