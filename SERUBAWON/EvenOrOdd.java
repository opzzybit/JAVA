import java.util.Scanner;
   public class EvenOrOdd{
     public static void main (String [] args){

   Scanner input = new Scanner (System.in);

   System.out.println("Enter any number:");
     int number = input.nextInt();

if (number % 2 == 0){
    System.out.println("EVEN");
}
else{
    System.out.println("ODD");
}
}
}
