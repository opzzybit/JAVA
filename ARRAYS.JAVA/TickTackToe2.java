import java.util.Scanner;
  
  public class TickTackToe2{

     public static void main (String [] args ){
     Scanner input = new Scanner (System.in); 
  
     char[][]  board = {{'1','2','3'},
                       {'6','5','4'} ,  
                       {'7','8','9'}};

System.out.println("WELCOME  TO THE GAME TIC TAC TOE  ");
  
for (int row = 0; row < board.length; row ++){
    for (int columns = row ; columns < board[row].length; columns ++){
       System.out.println ("Enter number :");
       char userinput = input.next().charAt(0);
        if (userinput == '1'){
            board[0][0]= 'x';
        }
        else if (userinput == '2'){
            board[0][1]= 'o';
        } 
        else if (userinput == '3'){
            board[0][2]= 'x';
        } 
         if (userinput == '6'){
            board[1][0]= 'x';
        }
        else if (userinput == '5'){
            board[1][1]= 'x';
        } 
        else if (userinput == '4'){
            board[1][2]= 'o';
        } 
         if (userinput == '7'){
            board[2][0]= 'x';
        }
        else if (userinput == '8'){
            board[2][1]= 'x';
        } 
        else if (userinput == '9'){
            board[2][2]= 'x';
        } 
    
    
    for (int rows = 0; rows < board.length; rows ++){
        for (int column = 0; column < board[rows].length; column ++){
            System.out.print(board[rows][column] + "\t" + "");    

}
    System.out.println("  " );       
} 
}
}
}
}












