import java.util.Scanner;

public class Barchart2{
    public static void main(String[] agrs){

       Scanner input = new Scanner(System.in);
  int largestnumber = 1;
 int smallestnumber = 0; 
        
int counter = 0;
for (int number = 1; number <= 5; number ++){
    counter += 1;
    System.out.println("Enter number : " + counter);
    int userinput = input.nextInt();
    System.out.println();

if (userinput > largestnumber){
   largestnumber = userinput; 
}   
if (userinput  < largestnumber ){
   smallestnumber = userinput;   
}  
}  
System.out.println("the largest number is " + largestnumber);
 System.out.println();
System.out.println("the smallest number is " + smallestnumber);
}
}
  
  
  
  
  
  
