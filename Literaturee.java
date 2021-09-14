import java.util.Scanner;
class Publisher {

    Scanner reader=new Scanner(System.in);
    String name;
    public Publisher(){
        name=" ";
    }
    public void input(){
        System.out.print("Enter publisher name: ");
        name=reader.next();
    }
}
class Book extends Publisher {
    String bname;
    int bid;

    public Book() {
        bname = " ";
        bid = 0;
    }

    public void binput() {
        System.out.print("Enter book id: ");
        bid = reader.nextInt();
        System.out.print("Enter book name: ");
        bname = reader.next();

    }
}
class Fiction extends Book{
    String fic;
    public Fiction(){
        fic=" ";
    }
    void finput(){
        System.out.print("Specify fiction or non fiction: ");
        fic=reader.next();
    }
}
class Literaturee extends Book {
    String lit;

    public Literaturee() {
        lit = " ";
    }

    void linput() {
        System.out.print("Enter type of literature: ");
        lit = reader.next();
    }

    public static void main(String[] args) {
        Literaturee i = new Literaturee();
        Fiction f=new Fiction();
        i.input();
        i.binput();
        f.finput();
        i.linput();
        System.out.println("\nBOOK DETAILS: ");
        System.out.println("Publisher name: " + i.name);
        System.out.println("Book id: " + i.bid);
        System.out.println("Book name: " + i.bname);
        System.out.println("Fiction or non-fiction: " + f.fic);
        System.out.println("Literature type: " + i.lit);

    }
}