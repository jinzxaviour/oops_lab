import java.util.Scanner;
import java.lang.Math;
public class Palindrome{

    public static void main(String args[])
    {
	 Scanner reader= new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = reader.nextInt();
     int sum = 0, r;
	 int temp = n;    
     while(n>0)
	   {    
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }    
      if(temp==sum)    
        System.out.println(temp+" is a Palindrome number");    
      else    
        System.out.println(temp+"  is Not a palindrome");    
     }  
}