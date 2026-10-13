import java.util.Scanner;
   public class DistanceCaculator{
     public static void main (String [] args){

        Scanner input = new Scanner (System.in);

         System.out.println("Enter distance in miles:");
            int mile  = input.nextInt();
    
        double miles1 = 1.60934;
        double kilometer = mile * miles1;

System.out.println("The distance in kilometer  is " + kilometer);
}
}
