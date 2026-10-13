 public class AccountBalance{

        public static void main(String [] args){

   double balance = 5000.0;
   
   double deposit = balance + 1200.50;

   double withdraw = deposit - 750.25;
 
   double monthlyinterest = 1.5 / 100;
   
   double finalbalance = monthlyinterest + deposit;

System.out.printf("The final balance is " +  "%.2f%n" ,finalbalance);
}
}
