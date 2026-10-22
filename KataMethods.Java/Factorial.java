import java.util.Scanner;
public class Factorial  {
          
          public static void main(String [] args) {
           
              Scanner inputCollector = new Scanner (System.in );
          
              System.out.println("  FACTORIAL CALCULATOR");    
             
              System.out.println();
              System.out.println("Enter any number: ");
              int userInput = inputCollector.nextInt();
        
              int result =  factorial(userInput);
    
             System.out.println(result);

          }

        public static int factorial(int number) {
            int result = 1;
            for (int index = 1; index <= number; index ++ ){
              result  *= index;
            }
            return result;
        }
}


