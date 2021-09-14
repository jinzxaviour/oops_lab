import java.util.Scanner;
import java.lang.Thread;
class A extends Thread
{
    public void run()
    {
        int m;
        for(int i=1;i<=10;i++)
        {
            m=i*5;
            System.out.println(i +"*5=" + m );
        }
    }
}
class B extends Thread
{
    public void run()
    {
        Scanner reader=new Scanner(System.in);
        int  i,n,p,count,flag;
        System.out.println("Enter the limit:"); 
        n=reader.nextInt();
        

System.out.println("Prime numbers");
p=2;
     i=1; 
     	while(i<=n)
     {
         flag=1;
         for(count=2;count<=p-1;count++)
         {
             if(p%count==0) 
             {
              flag=0;
              break;     
             } 
         }
             if(flag==1)
             {
               System.out.print(p+" ") ;
              i++;
             }
         p++;
     }
  }
    
}
public class Threadprime {
    public static void main(String[] args) {
       new A().start();
       new B().start();
    }
    
}