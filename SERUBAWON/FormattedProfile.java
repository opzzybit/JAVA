import java.util.Scanner;
   public class FormattedProfile{
     public static void main (String [] args){

   Scanner input = new Scanner (System.in);

   System.out.println("Enter First name:");
     String firstname = input.nextLine();

   System.out.println("Enter Last name:");
     String lastname = input.nextLine();
  
   System.out.println("Enter your year of birth :");
     int year = input.nextInt();

    int age = 2025 - year ;
    
System.out.printf("Your name is " + firstname + " " + lastname +  "," +"year of birth" + " " + year + "," +"you are "  + age + " " + "year old in 2025" );
}
}
