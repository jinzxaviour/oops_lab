
import java.util.Scanner;
class Search {
    public static void main(String[] args) {
        int n,c=0;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter number of elements:");
         n=reader.nextInt();
        int num[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=reader.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
int elem=reader.nextInt();
        for(int i=0;i<n;i++)
        {
            if(elem==num[i])
            {
            c++;
            }
        }
if(c==0)
         System.out.print("Element "+elem+" is not found ");
else System.out.print("Element " +elem+" is found " +c+" times ");
    }
}

