import java.util.Scanner;
    
    public class Taskfive{

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
     
         int sumofevennumber = 0;

if (number1 % 2 == 0){
   sumofevennumber = number1 + sumofevennumber;
}

if (number2 % 2 == 0){
   sumofevennumber = number2 + sumofevennumber;
}

if (number3 % 2 == 0){
   sumofevennumber = number3 + sumofevennumber;
}

if (number4 % 2 == 0){
   sumofevennumber = number4 + sumofevennumber;
}

if (number5 % 2 == 0){
   sumofevennumber = number5 + sumofevennumber;
}

if (number6 % 2 == 0){
   sumofevennumber = number6 + sumofevennumber;
}

if (number7 % 2 == 0){
   sumofevennumber = number7 + sumofevennumber;
}

if (number8 % 2 == 0){
   sumofevennumber = number8 + sumofevennumber;
}

if (number9 % 2 == 0){
   sumofevennumber = number9 + sumofevennumber;
}

if (number10 % 2 == 0){
   sumofevennumber = number10 + sumofevennumber;
}

System.out.println("The sum of even numbers is " + sumofevennumber);

}
 }

















