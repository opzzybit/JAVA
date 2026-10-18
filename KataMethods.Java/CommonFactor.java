import java.util.Scanner;
public class CommonFactor{
      
    public static int commonFactor(int number){
        
        int main_result = String.valueOf(0).length();
        int count = 1;
        for(int index = count; index <= number; index ++){
      
                if (number % index == 0){
                    System.out.println(index);    
                    main_result += index;
                }
        } 
        System.out.println();
        return main_result;
    }  
    public  static void main(String [] args ){
      Scanner input = new Scanner (System.in);
    
      System.out.println("Enter a number :");
      int  inputFactor = input.nextInt();
      
      int result = commonFactor(inputFactor);
    
      System.out.println(result); 
  
    }            
}



   
