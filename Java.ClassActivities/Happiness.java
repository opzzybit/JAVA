import java.util.Scanner;
   public class Happiness{
    
 public static double averageScores(double firstInteger, double secondInteger){

           double sum = firstInteger + secondInteger;
        
           double average = sum / 2;
              return average;
    
           if (average > 76.2){
                 return System.out.println("PROFICIENT");
            }
           else {
              if (average >= 50 && average <= 76.2){
                 return System.out.println("YOU ARE GETTING THERE");
            }
           else {
                 return System.out.println("YOU ARE GETTING THERE");
        } 
     }
 public static void main (String [] opzzy){
    
        Scanner OpzzybitCalculator = new Scanner (System.in);
       
      System.out.println("Enter any number :");
      int userinput1 = OpzzybitCalculator.nextInt();
    
    System.out.println("Enter any number :");
      int userinput2 = OpzzybitCalculator.nextInt();
       
       double result = averageScores(userinput1, userinput2);
}
}
 
 
 
 
