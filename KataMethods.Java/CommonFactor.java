import java.util.Scanner;
public class CommonFactor{
      
    public static int commonFactor(int number){
     
    int mainResult = 0;
     
    for(int index = 1; index <= number; index ++){
      
        if (number % index == 0){  
            System.out.println(index);
            mainResult += index;
        }
        
    } 
    System.out.println();
    return mainResult;
    }  
    public  static void main(String [] args ){
    Scanner input = new Scanner (System.in);
    
    System.out.println("Enter a number :");
    int  inputFactor = input.nextInt();
      
    int result = commonFactor(inputFactor);
    
    System.out.println(result); 
  
    }            
}



   
