import java.util.Scanner;
  
   public class Scaler{

        public static void main(String [] args){

    Scanner input = new Scanner (System.in);

    System.out.println("Enter your score :");
      int score = input.nextInt();
 
if (score > 50 ){
           
 System.out.println("Enter your real score (betweem 50) ");
}   
 
 int original = score;
 double scaledscore = original / 50;
 double multiple = scaledscore * 100;

System.out.println("The score your entered is " + original);
System.out.println("The scale of your score  " + multiple);

}
 }
