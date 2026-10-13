public class Sumofnumbers{

   public static void main (String [] args){
    
    long indexnumber = 0;
    long sum = 0;
System.out.printf("N    \tsum \n");
for (long index = 1; index <= 100; index ++){
  
   indexnumber = index; 
   sum += index;

System.out.printf(index + "\t" +   sum + "\n");
}
}
}
