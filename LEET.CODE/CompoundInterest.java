public class  CompoundInterest{

   public static void main (String [] args){
   
   double principal = 1000.0;
   double rate      = 0;
   
   System.out.printf(" year    \tAmount On deposit  \n");  
   for (double rater = 5; rater <= 10; rater ++ ){
      
      rate =  rater / 100;
      
}  
  for (int score = 5; score <= 10; score++){
  
    double result = principal * Math.pow(1.0 + rate, score);
    
  System.out.printf("%4d%,20.2f%n", score , result);
}
}
}
   
