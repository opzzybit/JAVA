import java.util.Scanner;
   public class CircleCalcutor{
     public static void main (String [] args){

   Scanner input = new Scanner (System.in);

    System.out.println("Enter number of radius :");
      double radius = input.nextInt();

    double pi = 3.1416;

    double areaofcircle = radius ** 2;
                                      
System.out.printf("The area of the circle is " + "%.2f%n" , areaofcircle);

}
}
