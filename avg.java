

import java.lang.Exception;
import java.util.Scanner;
class ExcepNeg extends Exception
{
    ExcepNeg(String message)
    {
        System.out.println(message);
    }
}
class avg{
    public static void main(String[] args){
        try {
            int i, n, sum=0;
            float average=0;
            int elem[]=new int[40];
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            n = reader.nextInt();
            System.out.println("Enter elements: ");
            for (i = 0; i < n; i++) {
                elem[i] = reader.nextInt();
                //System.out.print(elem[i]);
            }
            for(i=0;i<n;i++) {
                if (elem[i] >= 0) {
                    sum = elem[i] + sum;
                }
                else
                    throw new ExcepNeg("You Have Entered a Negative Number");
            }
             
                average = sum/n;
                System.out.print("\nAverage is " +average);
        }
        catch (ExcepNeg p) {
            
      } 
    }
}

