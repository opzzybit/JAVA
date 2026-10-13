import java.util.Scanner;
    
    public class Taskfour{

       public static void main(String [] args){

          Scanner input = new Scanner (System.in);
 
    System.out.println("Enter first score:");
      int number1 = input.nextInt();
    
    System.out.println("Enter second score:");
      int number2 = input.nextInt();

    System.out.println("Enter third score:");
      int number3 = input.nextInt();

    System.out.println("Enter fourth score:");
      int number4 = input.nextInt();

    System.out.println("Enter fifth score:");
      int number5 = input.nextInt();

    System.out.println("Enter sixth score:");
      int number6 = input.nextInt();

    System.out.println("Enter seventh score:");
      int number7 = input.nextInt();

    System.out.println("Enter eighth score:");
      int number8 = input.nextInt();

    System.out.println("Enter nineth score:");
      int number9 = input.nextInt();

    System.out.println("Enter tenth score:");
      int number10 = input.nextInt();
     
int socresum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
           
          int sum = 0;
for (int index = 1; index <= socresum; index ++){
  
if (index % 2 == 0){ 
   sum = index + sum;
}
  } 
  System.out.println(sum);
}
  }

















