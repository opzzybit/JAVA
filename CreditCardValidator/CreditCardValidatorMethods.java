import java.util.Scanner;
import java.util.ArrayList;
public class CreditCardValidatorMethods{
    public static String getTypeOfCreditCard(int[] numbers){
    
        if (numbers[0]  == 4){
            return "Visa Card ";
        }
        else if(numbers[0]  == 5){
            return "Master Card";
        }
         else if(numbers[0]  == 3 && numbers[1] == 7){
            return "American Express Card";
        }
         else if(numbers[0]  == 6){
            return "Discover Card";
        }
        else{
            return "Not found";
        }
        
    }
    public static int getLengthOfCreditCard(int[] numbers){
        int length = numbers.size();
        return length;
    }
    public static void main(String [] args){
        
        ArrayList<Integer> cardNumber = new ArrayList<Integer>();
        
       
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter Digit:");
        String userInput = inputCollector.nextLine();
        
        for (String numbers : userInput){
            int converter = Integer.parseInt(numbers);
            cardNumber.add(converter);
        }
        
        String typeConfirmation = getTypeOfCreditCard(ArrayList<Integer> cardNumber);
        
    
    
    
    
    
    }
}
