import java.util.Scanner;

public class Barchart2{
    public static void main(String[] agrs){

       Scanner input = new Scanner(System.in);
  int counter = 0;

for (int number = 1; number <= 5; number ++){
    counter += 1;
    System.out.println("Enter number between 1 and 30: " + counter);
    int userinput = input.nextInt();
  

   
System.out.println(); 
        int printout = userinput;
for (int counter2 = 1 ; counter2 <= printout ;counter2  ++){
   System.out.print("*");  
      System.out.println(); 
  }   
  }
 }
}
