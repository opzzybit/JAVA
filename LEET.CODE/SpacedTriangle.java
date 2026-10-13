public class SpacedTriangle{

   public static void main (String [] opzzy){
   
for (int numberoftimes = 1; numberoftimes <= 2; numberoftimes ++){

for (int count = 0 ; count < 8; count ++){
   
      for (int counter = 1; counter <= count ; counter ++ ){
  
  System.out.print("* ");
}
  System.out.println(" ");
}
 
for (int count = 8; count > 0; count --){
      System.out.print("\t");
      System.out.print("\t");
      System.out.print("\t");
      System.out.print("\t");
      
      for (int counter = 1; counter <= count ; counter ++ ){
  
    System.out.print("* ");
}
   System.out.println(" ");
} 
 
 } 
 }
 }
