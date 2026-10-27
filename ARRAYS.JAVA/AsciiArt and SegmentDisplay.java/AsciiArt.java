import java.util.Scanner;
public class AsciiArt{
    public static void main(String [] args){
    
    AsciiArtMethods artWork = new AsciiArtMethods();
    SegmentDisplayMethod  binaryDisplay = new SegmentDisplayMethod();
    
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.println("""
                       WELCOME  OPZZY  ASCII  ART [HAVE SOME FUN].
                        YOU CAN ALSO ENTER BINARY DIGIT[0 & 1]
    
    """);
    
    
    while(true){
    System.out.println("Enter the name of any diagram. [09 to Exit]:");
    String userInput = inputCollector.nextLine();
    System.out.println();
    
    if (userInput.equalsIgnoreCase("cat")){
        for(int row = 0;row < artWork.getCat().length;row ++){
           for(int column = 0; column < artWork.getCat()[row].length; column ++){
                System.out.print(artWork.getCat()[row][column]);
            }
        System.out.println("  ");
        }
    }
    else if (userInput.equalsIgnoreCase("house")){
        for(int row = 0;row < artWork.getHouse().length;row ++){
            for(int column = 0; column < artWork.getHouse()[row].length; column ++){
                System.out.print(artWork.getHouse()[row][column]);
            }
        System.out.println("  ");
        }
    }
    else if (userInput.equalsIgnoreCase("diamond")){
        for(int row = 0;row < artWork.getDiamond().length;row ++){
            for(int column = 0; column < artWork.getDiamond()[row].length; column ++){
                System.out.print(artWork.getDiamond()[row][column]);
            }
        System.out.println("  ");
        }
    }
    else if (userInput.equalsIgnoreCase("heart")){
        for(int row = 0;row < artWork.getHeart().length;row ++){
            for(int column = 0; column < artWork.getHeart()[row].length; column ++){
                System.out.print(artWork.getHeart()[row][column]);
            }
        System.out.println("  ");
        }
    }
    else if (userInput.equalsIgnoreCase("robot")){
        for(int row = 0;row < artWork.getRobot().length;row ++){
            for(int column = 0; column < artWork.getRobot()[row].length; column ++){
                System.out.print(artWork.getRobot()[row][column]);
            }
        System.out.println("  ");
        }
    }
    else if (userInput.equalsIgnoreCase("animal")){
        for(int row = 0;row < artWork.getAnimal().length;row ++){
            for(int column = 0; column < artWork.getAnimal()[row].length; column ++){
                System.out.print(artWork.getAnimal()[row][column]);
            }
        System.out.println("  ");
        }
    }  
    else if (userInput.equalsIgnoreCase("tree")){
        for(int row = 0;row < artWork.getTree().length;row ++){
            for(int column = 0; column < artWork.getTree()[row].length; column ++){
                System.out.print(artWork.getTree()[row][column]);
            }
        System.out.println("  ");
        }
    }   
    else if (userInput.equals("11111101")){
          for(int row = 0; row < binaryDisplay.getDigitZero().length; row++){
              for (int column = 0;column < binaryDisplay.getDigitZero()[row].length; column++ ){
                  System.out.print(binaryDisplay.getDigitZero()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
      else if (userInput.equals("01100001")){
          for(int row = 0; row < binaryDisplay.getDigitOne().length; row++){
              for (int column = 0;column < binaryDisplay.getDigitOne()[row].length; column++ ){
                  System.out.print(binaryDisplay.getDigitOne()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
       else if (userInput.equals("11011011")){
          for(int row = 0; row < binaryDisplay.getDigitTwo().length; row++){
              for (int column = 0;column < binaryDisplay.getDigitTwo()[row].length; column++ ){
                  System.out.print(binaryDisplay.getDigitTwo()[row][column]);
              
              }
           System.out.println("  " );
          }
      }
     else if(userInput.equals("09")){
          System.out.println("\"THANKS FOR USING THE APP !!!!!\"");
          break;
    }
    
    
    else{
        System.out.println();
        System.out.println("It's not in the package");
    
    }
   
   }   
    
    
    
    }
}
