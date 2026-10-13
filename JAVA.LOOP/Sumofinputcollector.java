import java.util.Scanner;

    public class Sumofinputcollector{

          public static void main (String [] args ){
          
             Scanner input = new Scanner (System.in);
             
System.out.println("Enter any number :");
  int usernumber = input.nextInt();

int sum = 0;
for (int counter = 1; ++ counter <= usernumber; ){ 
    sum +=  counter;
            
}              
  System.out.println();
  System.out.println("THE SUM OF THE NUMBER YOU ENTERED IS ");
  System.out.println(sum);

    }
 }
             
             
      
      
      
      
      
      
      
      
      
      
      


















