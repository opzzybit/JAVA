import java.util.Scanner;
 
   public class PerfectSquare{
    
    public static  boolean isSquare(int squareNumber){ 
       squareNumber *= squareNumber ;
  if (squareNumber % 2 == 0 ){
         return true;
  }
  else{
         return false;
  }       
}  
     
     public static void main(String [] args){
   
   Scanner inputCollector = new Scanner(System.in);
  
   System.out.println("Enter any number :");
     int inputnumber = inputCollector.nextInt();
  
   boolean result = isSquare(inputnumber);
 
 System.out.println(result);
 


} 
 

}
   


