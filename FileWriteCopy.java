import  java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

class FileWriteCopy
{
  
 public static void main(String[] args)
 {
  try{
  Scanner reader=new Scanner(System.in);
  String string;
  System.out.print("Enter the string : ");
  string=reader.nextLine();
  FileWriter fw=new FileWriter("D:\\Java\\write.txt");
  
  fw.write(string);
  fw.close();

  FileReader fr=new FileReader("D:\\Java\\write.txt");
  
  String str="";
  int i;
  while((i=fr.read())!=-1){
   str+=(char)i;
  }
 
 System.out.print(str);
 }
 
 catch(IOException e){
   System.out.println("Exception");
  }


 }

}