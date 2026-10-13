import java.util.Scanner;

public class BarChart{
    public static void main(String[] agrs){

       Scanner input = new Scanner(System.in);

    System.out.print("Enter number between 1 and 30: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter number between 1 and 30: ");
    int secondNumber = input.nextInt();
         
      
    System.out.print("Enter number between 1 and 30: ");
    int thirdNumber = input.nextInt();
  
 
    System.out.print("Enter number between 1 and 30: ");
    int fourthNumber = input.nextInt();
   
    System.out.print("Enter number between 1 and 30: ");
    int fifthNumber = input.nextInt();
  

      for(int count = 1; count <=  firstNumber; count++){
          System.out.print("*");
        }
         System.out.println();
    
         for(int count = 1; count <= secondNumber; count++){
              System.out.print("*");
            }
              System.out.println();

         for(int count = 1; count <= thirdNumber; count++){
          System.out.print("*");
        }
          System.out.println();

          for(int count = 1; count <= fourthNumber; count++){
          System.out.print("*");
        }
          System.out.println();

          for(int count = 1; count <= fifthNumber; count++){
          System.out.print("*");
         }
          System.out.println();


    }
}
