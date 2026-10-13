import java.util.Scanner;
  
  public class TickTackToe2{

     public static void main (String [] args ){
  Scanner input = new Scanner (System.in); 
  
    String[][]  board = {{"1","2","3"},
                        {"6","5","4"} ,  
                        {"7","8","9"}};

System.out.println("WELCOME  TO THE GAME TIC TAC TOE  ");
  
for (int row = 0; row < board.length; row ++){
    for (int columns = row ; columns < board[row].length; columns ++){
       
        System.out.println ("Enter number :");
              String userinput = input.nextLine();
                
              
                board[row][columns] = userinput;
                

     System.out.println();
for (int rows = 0; rows < board.length; rows ++){
      for (int column = 0; column < board[rows].length; column ++){
           System.out.print(board[rows][column] + "\t");   

}
    System.out.println("  " );       
} 
}
}
}
}












