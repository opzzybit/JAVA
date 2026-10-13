import java.util.Arrays;
import java.util.Scanner;
 
     public class ArrayTesk2{
    
     int[]  sorted ={1,2,3,4,5};
    
    public static int sortThis(int number1,int number2,int number3,int number4,int number5){
    
     System.out.println(); 
     for (int counter = 0; counter < 5; counter ++){
   
     System.out.print(sorted[counter]);   
     return sorted[counter];
}
}
 
    public static void main(String [] opzzy){
     Scanner input = new Scanner (System.in);
  
     for (int count = 0; count < sorted.length; count++ ){
       System.out.println("Enter any number:");
         int userinput = input.nextInt();
      
       sorted[count] = userinput;
       }

    
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
 }
