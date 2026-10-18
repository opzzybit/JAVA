public class Factorial {
       
       
 public static int  factorialNumber(int firstnumber , int secondnumber){
        
        
        int input2    = secondnumber;
        int input1    = firstnumber;
        int calculation = 1;  
        int calculation2 = 1;
        int calculation3 = 0;
        int subtraction = input1 - input2;
        int multiplication = 0;
for (int index = 1 ; index <= firstnumber; index ++){
             calculation *= index;
}        
for (int index2 = 1 ; index2 <= secondnumber ; index2 ++ ){
                     calculation2 *= index2;
}  
for (int index3 = 1 ; index3 <= subtraction ; index3 ++ ){ 
      
      
       calculation3 = subtraction * index3;
       
       multiplication = calculation3 * calculation2;
       
       
}
     return calculation / multiplication;
      

}

public  static void main(String [] args) {
 
 int result = factorialNumber(5, 3);  
 System.out.println(result);
 }  



}
       
