import java.util.Scanner;
public class SegmentDisplay7{
      public static void main(String [] args){
      
      SegmentDisplayMethod digitDisplay = new SegmentDisplayMethod();
      
      Scanner input = new Scanner (System.in);
      
      System.out.println("\t\t  WELCOME  TO  SEVEN  [7]  SEGMENT  DISPLAY  ");
      
      System.out.println();
      while(true){
      System.out.println();
      System.out.println("Enter eight [8] binary digit (0 & 1). [09] to exit ");
      String userInput  = input.nextLine();
      
      System.out.println();
      if (userInput.equals("11111101")){
          for(int row = 0; row < digitDisplay.getDigitZero().length; row++){
              for (int column = 0;column < digitDisplay.getDigitZero()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitZero()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
      else if (userInput.equals("01100001")){
          for(int row = 0; row < digitDisplay.getDigitOne().length; row++){
              for (int column = 0;column < digitDisplay.getDigitOne()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitOne()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
       else if (userInput.equals("11011011")){
          for(int row = 0; row < digitDisplay.getDigitTwo().length; row++){
              for (int column = 0;column < digitDisplay.getDigitTwo()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitTwo()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
       else if (userInput.equals("11110011")){
          for(int row = 0; row < digitDisplay.getDigitThree().length; row++){
              for (int column = 0;column < digitDisplay.getDigitThree()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitThree()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
      else if (userInput.equals("01100111")){
          for(int row = 0; row < digitDisplay.getDigitFour().length; row++){
              for (int column = 0;column < digitDisplay.getDigitFour()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitFour()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
      else if (userInput.equals("10110111")){
          for(int row = 0; row < digitDisplay.getDigitFive().length; row++){
              for (int column = 0;column < digitDisplay.getDigitFive()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitFive()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
      else if (userInput.equals("00111111")){
          for(int row = 0; row < digitDisplay.getDigitSix().length; row++){
              for (int column = 0;column < digitDisplay.getDigitSix()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitSix()[row][column]);
              
              }
           System.out.println("  " );
          }
      } 
       else if (userInput.equals("11100001")){
          for(int row = 0; row < digitDisplay.getDigitSeven().length; row++){
              for (int column = 0;column < digitDisplay.getDigitSeven()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitSeven()[row][column]);
              
              }
           System.out.println("  " );
          }
      } 
       else if (userInput.equals("11111111")){
          for(int row = 0; row < digitDisplay.getDigitEight().length; row++){
              for (int column = 0;column < digitDisplay.getDigitEight()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitEight()[row][column]);
              
              }
           System.out.println("  " );
          }
      } 
       else if (userInput.equals("11100111")){
          for(int row = 0; row < digitDisplay.getDigitNine().length; row++){
              for (int column = 0;column < digitDisplay.getDigitNine()[row].length; column++ ){
                  System.out.print(digitDisplay.getDigitNine()[row][column]);
              
              }
           System.out.println("  " );
          }
      } 
      else if(userInput.equals("09")){
              System.out.println("See You Later!!!!");
              break;
      }
      else {
            System.out.println("NOT FOUND !!!!! TRY AGAIN ");
            System.out.println();
      }
      
      
      
      }
      }
}
