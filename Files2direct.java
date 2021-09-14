import  java.io.File;
import java.util.Scanner;
public class Files2direct
{
  static void RecursivePrint(File[] arr,int index,int level)
  {
    if(index==arr.length)
      return;
    for(int i=0;i<level;i++)
      System.out.print("\t");
    if(arr[index].isFile())
     System.out.println(arr[index].getName());
   else if(arr[index].isDirectory())
   {
     System.out.println("[" +arr[index].getName() + "]");
     RecursivePrint(arr[index].listFiles(),0,level+1);
   }

     RecursivePrint(arr,++index,level);

  }
 public static void main(String[] args)
 {
  String file;
  int flag=0;
  Scanner reader=new Scanner(System.in);
  String maindirpath="D:\\Java\\zamp";
  File maindir=new File(maindirpath);
  if(maindir.exists() && maindir.isDirectory())
  {
    File arr[]=maindir.listFiles();
    String[] files=maindir.list();
    System.out.println("========================");
    System.out.println("Files of directory: " +maindir);
    System.out.println("========================");
   
    RecursivePrint(arr,0,0);
     
 
 System.out.print("Enter File Name : ");
 file=reader.next();
 
 for(int i=0;i<files.length;i++)
  {
    String fname=files[i];
    //System.out.print(fname);
    if(fname.equals(file))
      flag=1;
   }
 if(flag==1)
     System.out.print("Found");
 else
     System.out.print("Not found");
  }
 }

}


