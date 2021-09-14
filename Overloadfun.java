import java.util.Scanner;
class Addition
{
  void addition(int x , int y)
  {
     int sum=x+y;
     System.out.println("the sum of two number is "+sum);
  }
  void addition(int x,int y, int z)
  {
     int sum=x+y+z;
     System.out.println("the sum of three numbers is "+sum);
  }
  void addition(double x,double y)
  {
     double sum=x+y;
     System.out.println("the sum of two numbers is "+sum);
  }
}
class Overloadfun
{
  public static void main(String args[])
  {
     int x,y,z,d,c;
     double a,b;
     Scanner sc= new Scanner(System.in);
     Addition ad = new Addition();
     System.out.print("enter the two numbers: ");
     x=sc.nextInt();
     y=sc.nextInt();
     System.out.print("enter the 3 numbers: ");
     c=sc.nextInt();
     d=sc.nextInt();
     z=sc.nextInt();
     System.out.print("enter the 2 float numbers: ");
     a=sc.nextDouble();
     b=sc.nextDouble();
     ad.addition(x,y);
     ad.addition(c,d,z);
     ad.addition(a,b);

  }
}