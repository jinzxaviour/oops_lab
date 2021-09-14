import java.util.Scanner;

interface Sports {
    void sinput();
    void soutput();

}
class Student {
    Scanner reader=new Scanner(System.in);
    int rolln;
    float amark;
    Student(){
        rolln=0;
        amark=0;
    }
    void stinput(){
        System.out.print("Enter roll number: ");
        rolln=reader.nextInt();
        System.out.print("Enter academic mark: ");
        amark=reader.nextFloat();
    }
    void stoutput(){
        System.out.println("\nRoll number: "+rolln);
        System.out.println("Academic mark: "+amark);
    }
}

class Result extends Student implements Sports{
    Scanner reader=new Scanner(System.in);
    float tot,smark;
    public void sinput(){
        System.out.print("Enter sports mark: ");
        smark = reader.nextFloat();
    }
    public void soutput() {

        System.out.println("Sports mark: "+smark);
        tot=amark+smark;
        System.out.println("Total mark: "+tot);
    }
}
class Studinh{
    public static void main(String[] args){
        Result r=new Result();
        r.stinput();
        r.sinput();
        r.stoutput();
        r.soutput();
    }
}