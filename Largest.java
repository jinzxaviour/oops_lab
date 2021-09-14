import java.util.Scanner;
public class Largest {
    public static void main(String [] args) {
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter  the first number:");
      int num1=reader.nextInt();
      System.out.print("Enter  the second number:");
      int num2=reader.nextInt();
      System.out.print("Enter  the third number:");
      int num3=reader.nextInt();
      if(num1>num2&&num1>num3)
            System.out.println("The number " + num1 + " is bigger");
        else if(num2>num1&&num2>num3)
             System.out.println("The number" + num2 + " is bigger");
            else
                  System.out.println("The number " + num3 + " is bigger");
      }
}
