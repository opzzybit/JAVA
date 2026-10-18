import  java.util.Scanner;
public class  ReverseNumber{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter five  numbers:");
		       int number = input.nextInt();
		 
		        int sum = 0;
         for(int count = number; count >= number ; count ++){
         
              sum = sum + count;
	}	
	
         System.out.print(sum);
	
 
 		}
}
