import java.util.Scanner;
  
  public class TickTackToe2{

     public static void main (String [] args ){
     Scanner input = new Scanner (System.in); 
  
     char[][]  board = {{'1','2','3'},
                        {'6','5','4'} ,  
                       {'7','8','9'}};

System.out.println("WELCOME  TO THE GAME TIC TAC TOE  ");
  
System.out.println(); 
String mainBoard ="""
1     2     3

6     5     4

7     8     9

"""; 
   System.out.print(mainBoard); 

for (int row = 0; row < board.length; row ++){
    for (int columns = row ; columns < board[row].length; columns ++){
       System.out.println ("player one you are [X] "); 
       System.out.println ("Enter number :");
       char userinput = input.next().charAt(0);
        if (userinput == '1'){
            board[0][0]= 'X';
        }
        else if (userinput == '2'){
            board[0][1]= 'X';
        } 
        else if (userinput == '3'){
            board[0][2]= 'X';
        } 
        else if (userinput == '6'){
            board[1][0]= 'X';
        }
        else if (userinput == '5'){
            board[1][1]= 'X';
        } 
        else if (userinput == '4'){
            board[1][2]= 'X';
        } 
         if (userinput == '7'){
            board[2][0]= 'X';
        }
        else if (userinput == '8'){
            board[2][1]= 'X';
        } 
        else if (userinput == '9'){
            board[2][2]= 'X';
        } 
     
      
      System.out.println ();
      System.out.println ("player two you are [O]");    
      System.out.println ("Enter number :");
       char userinput2 = input.next().charAt(0);
        if (userinput2 == '1'){
            board[0][0]= 'O';
        }
        else if (userinput2 == '2'){
            board[0][1]= 'O';
        } 
        else if (userinput2 == '3'){
            board[0][2]= 'O';
        } 
        else if (userinput2 == '6'){
            board[1][0]= 'O';
        }
        else if (userinput2 == '5'){
            board[1][1]= 'O';
        } 
        else if (userinput2 == '4'){
            board[1][2]= 'O';
        } 
        else if (userinput2 == '7'){
            board[2][0]= 'O';
        }
        else if (userinput2 == '8'){
            board[2][1]= 'O';
        } 
        else if (userinput2 == '9'){
            board[2][2]= 'O';
        } 
    
    
  
  System.out.println ();
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












