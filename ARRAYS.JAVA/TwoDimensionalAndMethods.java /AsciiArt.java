import java.util.Scanner;
public class AsciiArt{
    public static void main(String [] args){
    
    AsciiArtMethods artWork = new AsciiArtMethods();
    
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.println("Enter the diagram you want:");
    String userInput = inputCollector.nextLine();
    
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
    
    
    
    }
}
