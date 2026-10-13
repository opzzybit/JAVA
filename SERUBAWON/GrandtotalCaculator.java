import java.util.Scanner;
   public class GrandtotalCaculator{
     public static void main (String [] args){

        Scanner input = new Scanner (System.in);

         System.out.println("Enter your item price :");
            int itemprice  = input.nextInt();

         System.out.println("Enter the quantity of the item :");
            int quantity = input.nextInt();


     int subtotal = itemprice * quantity;
     double VAT      = subtotal * 0.20;
     double grandtotal = subtotal + VAT;
 
 System.out.println("The price grand total is " + grandtotal);
}
}



