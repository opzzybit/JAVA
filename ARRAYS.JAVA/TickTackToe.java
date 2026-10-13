import java.util.Scanner;

   public class TickTackToe{
   
      public static void main(String [] args){
      
  Scanner input = new Scanner (System.in);
  
  char[][] game = new char [3][3];
  


System.out.println("WELCOME TO TICK , TACK, TOE"); 
  
for(char count = 0; count < 9; count++){

System.out.println("Enter X or O");
 char userinput = input.next().charAt(0);
 
 game[count] = userinput;
}
System.out.println();
for(int row = 0; row < game.length; row++ ){

for(int column = 0;column < game[row].length; column++ ){

for(int printout = 0; printout < 9; printout++){
  
  System.out.print(game[printout] + "  ");
}
}
}
System.out.println();
for(char converter = 0; converter < 1; converter++){
  
  char x = 1;
  char o = 0;
  
  
  if (game[converter] ==  'x' ){
    System.out.print("1");
}
  if (game[converter] == 'o' ){
    System.out.print("0");
}
}















}
}







