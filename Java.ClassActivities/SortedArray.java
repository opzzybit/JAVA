import java.util.Scanner;
public class SortedArray{

       public static void main(String [] args){
    
       char[] vowel = {'a','e','i'};
       
       
       Scanner InputCollector = new Scanner (System.in);
       System.out.println("Enter Your Name : ");
       String userInput = InputCollector.nextLine();

 
      String result = sort(userInput);
 }     
public static String sort(String number){

 for(int count = number.length()-1 ; count >= 0; count-- ){
   
 
    return  System.out.println(number.charAt(count));
    } 
    System.out.println();
    }
  
}

