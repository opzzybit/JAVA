import java.util.Scanner;
  
  public class ArrayTask1{

     public static void main (String [] args ){

   Scanner inputCollector = new Scanner (System.in);
  int counter;
 int[] array  = new int[5];
 
 counter = 0;
 for(int number = 0; number < 5 ; number ++){
   counter += 1;
   System.out.println("Enter number " + counter);
     int inputnumber = inputCollector.nextInt();
       
      array[number] = inputnumber;
   System.out.println();
}    
 System.out.println("ARRAY OUTPUT");
for (counter = 0;counter < 5; counter++){
  
  System.out.println(array[counter]);
   
}
System.out.println();
System.out.println("LARGEST NUMBER OF THE ARRAY ");
int largestnumber = array[0];
int smallestnumber = array[0];

for (int number = 0 ; number < 5; number++ ){

if (array[number] > largestnumber){
    largestnumber = array[number];
}
if (array[number] < smallestnumber){
    smallestnumber = array[number];
}

}
 System.out.println("the largest number is " + largestnumber);
 
 System.out.println();
 System.out.println("SMALLEST NUMBER OF THE ARRAY ");
 System.out.println("the smallest number is " + smallestnumber);

int sum = 0;
System.out.println();
for (int number = 0; number < 5; number++){

 sum += array[number]; 

}
  double average = sum / 5.0;
System.out.println("AVERAGE OF THE ARRAY");
System.out.println("the average of all the number is " + average);

}
}

 


















