


import java.util.Scanner;
class CPU{
    double price;
    class processor{
        String maufacturer;
        int  cores;
    }
    static  class RAM{
        String manufact;
        float memory;        
    }
}

public class Computer {
    public static void main (String [] args)
    {
        CPU cp=new CPU();
        CPU.processor pro=cp.new processor();
        CPU.RAM rm=new CPU.RAM();
       
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter CPU price:");
        cp.price=reader.nextDouble();
       
        System.out.println("Enter processor number of crores:");
        pro.cores=reader.nextInt();
       
        reader.nextLine();
        System.out.println("Enter Processor manufacturer:");
        pro.maufacturer=reader.nextLine();
       
        System.out.print("Enter RAM memory(GB):");
        rm.memory=reader.nextFloat();
        reader.nextLine();
        System.out.print("Enter RAM maufacturer:");
        rm.manufact=reader.nextLine();
       
         System.out.println("\nComputer Details");  
         System.out.println("CPU Price : "+cp.price);
         System.out.println("\n Processor :\nNo.of cores: "+pro.cores);
         System.out.println("Manufacture Name : "+pro.maufacturer);
         System.out.println("\n RAM: RAM Memory(GB) : "+rm.memory);
         System.out.println("Manufacture Name : "+rm.manufact);      
    }
} 


