import java.util.Scanner;
    public class Swap3{
       public static void main (String [] args){
       
  Scanner inputCollector = new Scanner (System.in);
      

    System.out.println("Enter any number :");
      int userinput1 = inputCollector.nextInt();
    
    System.out.println("Enter any number :");
      int userinput2 = inputCollector.nextInt();
 System.out.println();
  System.out.println("Before user input is " + userinput1 + " "  + userinput2);     
     
     int number = userinput1 + userinput2;
     
     int number1 = number - userinput1;
     
     int number2 = number - userinput2;
   System.out.println();  
  System.out.println("After user input is " + number1 +  " " +  number2);
}
}

