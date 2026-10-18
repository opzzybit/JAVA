   import java.util.Scanner;
     public class LargestSmallestNumber{
        public static void main(String [] arg){

       Scanner input = new Scanner(System.in);
    
  System.out.println("Enter first number:");
    int firstNumber = input.nextInt();

    System.out.println("Enter second number:");
    int secondNumber = input.nextInt();
         
      
    System.out.println("Enter third number: ");
    int thirdNumber = input.nextInt();
  
 
    System.out.println("Enter fourth number: ");
    int fourthNumber = input.nextInt();
   
    System.out.println("Enter fifth number: ");
    int fifthNumber = input.nextInt();
      
      int largest = firstNumber;
      int smallest = firstNumber;
      
     if (secondNumber > largest){
     largest = secondNumber;
}
     if (thirdNumber > largest){
     largest = thirdNumber;
}
     if (fourthNumber > largest){
     largest = fourthNumber;
} 
     if (fifthNumber > largest){
     largest = fifthNumber;
}
     if (secondNumber > smallest){
     smallest = secondNumber;
}
     if (thirdNumber > smallest){
     smallest = secondNumber;
}
     if (fourthNumber > smallest){
     smallest = secondNumber;
} 
     if (fifthNumber > smallest){
     smallest = secondNumber;
} 
     System.out.println("The smallest number is " + smallest);
     System.out.println("The largest number is " + largest);

}
  }
      
