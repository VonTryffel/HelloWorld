import java.util.Scanner;

public class Skannanummer{
   public static void main(String[] args){
   
   Scanner s = new Scanner(System.in);
   
   int [] numbers = new int[10];
   
   int sum = 0;
   
   System.out.println("Skriv in 10 siffror");
   for(int i = 0;i < 10;i = i + 1){
      numbers[i] = s.nextInt();
      sum += numbers[i];
   }
   System.out.println("Tal: ");
   for(int i = 0;i < 10;i = i + 1){
      System.out.println(numbers[i]);
   }
   System.out.println("Summa: "+ sum);
   
   
   }
   
   
} 