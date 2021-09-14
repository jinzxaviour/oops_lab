import java.util.Scanner;
public class Positive {
    public static void main(String [] args) {
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter  the number:");
      int num=reader.nextInt();
      String x=(num>0)?"POSITIVE":(num>0)?"NEGATIVE":"ZERO";
       System.out.println("The number " + num + " is a "+x+ " number.");
      }
}
