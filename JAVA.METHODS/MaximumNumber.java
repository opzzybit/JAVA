public class MaximumNumber{
 
    public static int maximumNumber(int number1, int number2){ 
          if (number1 > number2){
              return number1;
          } 
          else{
              return number2;
          }     

    }  
    public static void main(String [] args) {
    
    int maximum = maximumNumber(100, 208);  
    
    System.out.println("the maximum number is " + maximum);
    }
      
}

