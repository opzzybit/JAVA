public class Diamond {

   public static void main (String [] opzzy){
    
    int count = 5;
for (int counter1 = 1 ; counter1 <= count; counter1 ++){
   for (int counter2 = counter1; counter2 <= count ; counter2 ++ ){
          System.out.print(" ");
   }
   for (int counter2 = 1; counter2 <= counter1; counter2 ++ ){
          if (counter2 % 2 == 0){
             System.out.print("* ");
   }
   }
   System.out.println(); 
   }

     int upper = 5;
for (int upper1 = 1 ; upper1 <= upper; upper1 ++){
   for (int upper2 = 1; upper2 <= upper1 ; upper2 ++ ){
          System.out.print(" ");
   }
   for (int upper2 = upper1 ; upper2 <= upper; upper2 ++ ){
       if (upper2 % 2 == 0){   
          System.out.print("* ");
   }
   }
   System.out.println(); 
   }

   }
   }
