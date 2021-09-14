package graphics;

import java.util.Scanner;

        interface areafigure {
        void tri();
        void rect();
        void sqr();
        void cir();
    }
    public class fig{
        Scanner reader=new Scanner(System.in);
        public void tri(){
            System.out.print("\n Enter the breadth and height of triangle:  ");
            float b=reader.nextFloat();
            float h=reader.nextFloat();
            System.out.print("The area of triangle is: "+(0.5*(b*h)));
        }
        public void rect(){
            System.out.print("\n\n Enter the length and breadth of rectangle:  ");
            float l=reader.nextFloat();
            float b=reader.nextFloat();
            System.out.print("The area of rectangle is: "+(l*b));
        }
        public void sqr(){
            System.out.print("\n\n Enter the side of square:  ");
            float s=reader.nextFloat();
            System.out.print("The area of square is: "+(s*s));
        }
        public void cir() {
            System.out.print("\n\n Enter the radius of circle:  ");
            float r = reader.nextFloat();
            System.out.print("The area of circle is: " + (3.14 * r * r));
        }
}