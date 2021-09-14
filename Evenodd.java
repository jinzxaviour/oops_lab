import java.util.Scanner;
import java.lang.Math;
public class Evenodd {
    public static void main(String  args[]) {
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter a number:");
      int num=reader.nextInt();
      if(num%2==0)
      {
      System.out.println("Number "  + num +  " is Even");
      }
      else
      {
       System.out.println("Number "  + num +  " is Odd");   
      }
    }
}
