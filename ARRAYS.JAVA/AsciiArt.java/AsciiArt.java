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
      
    
    
    
    }
}
