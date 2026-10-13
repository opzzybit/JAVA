import java.util.Scanner;
   public class Caculator{
     public static void main (String [] args){

   Scanner input = new Scanner (System.in);

   System.out.println("Enter First number:");
     int number1 = input.nextInt();

   System.out.println("Enter Second number:");
     int number2 = input.nextInt();
 
   int sum = number1 + number2;
   
   int difference = number1 - number2;
 
   int product = number1 * number2;

   int quotient = number1 / number2;

System.out.println("sun of the numbers is = " + sum);
System.out.println("difference of the numbers is = " + difference);
System.out.println("the product of all the numbers is  = " + product);
System.out.println("the quotient of all the number is = " + quotient);

}
 }





