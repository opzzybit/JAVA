import java.util.Scanner;
public class Happiness{
    
  public static double averageScores(int firstInteger, int secondInteger){

    int sum = firstInteger + secondInteger;
        
    double average = sum / 2;
    System.out.println(average);
    if (average > 76.2){
        System.out.println("PROFICIENT");
        return average;    
    }
    else if (average >= 50 && average <= 76.2){
        System.out.println("YOU ARE GETTING THERE");
        return average;
    }
    else {
        System.out.println("YOU ARE GETTING THERE");
        return average;
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
 
 
 
 
