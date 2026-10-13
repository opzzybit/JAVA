import java.util.Scanner;
   public class TaxCalcutor{
     public static void main (String [] args){

   Scanner input = new Scanner (System.in);

   System.out.println("Enter the price:");
     int price = input.nextInt();

 double Calculator = price * 0.075;
 double total = price + Calculator;
 System.out.printf("the total amount of tax is = " + "%.2f%n" ,total);
}
}
