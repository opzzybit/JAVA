import java.util.Scanner;
    
    public class Taskonejava{

       public static void main(String [] args){


          Scanner input = new Scanner (System.in);
 
    System.out.println("Enter first number:");
      int number1 = input.nextInt();
    
    System.out.println("Enter second number:");
      int number2 = input.nextInt();

    System.out.println("Enter third number:");
      int number3 = input.nextInt();

    System.out.println("Enter fourth number:");
      int number4 = input.nextInt();

    System.out.println("Enter fifth number:");
      int number5 = input.nextInt();

    System.out.println("Enter sixth number:");
      int number6 = input.nextInt();

    System.out.println("Enter seventh number:");
      int number7 = input.nextInt();

    System.out.println("Enter eighth number:");
      int number8 = input.nextInt();

    System.out.println("Enter nineth number:");
      int number9 = input.nextInt();

    System.out.println("Enter tenth number:");
      int number10 = input.nextInt();
     

   int sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
   
   System.out.println("the sum of all the number is " + sum);

}
 }
