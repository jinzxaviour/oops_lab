import java.util.Scanner;
class ShapeArea
{
   void area(float x)
  {
     System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
  }
  void area(float x, float y)
  {
     System.out.println("the area of rectangle is "+x*y+" sq units");
  }
  void area(double x)
  {  
     double z=3.14*x*x;
     System.out.println("the area of the circle is "+z+" sq units");
  }
}
class Overload
{  
   public static void main(String args[])
   {
      int s,l,b;
      double r;
      Scanner sc=new Scanner(System.in);
      ShapeArea ob = new ShapeArea();
      System.out.print("enter the side of square: ");
      s=sc.nextInt();
      System.out.print("enter the length and breadth rectangle: ");
      l=sc.nextInt();
      b=sc.nextInt();
      System.out.print("enter the radius of circle: ");
      r=sc.nextDouble();
       ob.area(s);
       ob.area(l,b);
       ob.area(r);
   }
}