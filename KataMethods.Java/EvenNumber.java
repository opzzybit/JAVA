import java.util.Scanner;
 
   public class EvenNumber{
    
    public static  boolean isEven(int evenNumber){ 
  
  if (evenNumber % 2 == 0 ){
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
  
   boolean result = isEven(inputnumber);
 
 System.out.println(result);
 


} 
 

}
   




  
