public class Swap{
     public static void main (String [] args){

 int number1 = 4;
 int number2 = 10;
 
System.out.println("BEFORE " + "Number 1 = "  + number1 + "," + "Number 2 = "  + number2);
 int sumofnumber = number1 + number2;
 int afternum1 = sumofnumber - number1;
 int afternum2 = sumofnumber - number2;

System.out.println("AFTER " + "Number 1 = " + afternum1 + "," + "Number 2 = " + afternum2);
}
}

