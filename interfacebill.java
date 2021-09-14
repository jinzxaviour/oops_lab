
import java.util.Date;
import java.util.Scanner;

interface bill {
    float calcul();
    void in();
    void op();
}
class bills implements bill{
    float price, net = 0;
    int prod_id,qty;
    String name;
    Scanner reader = new Scanner(System.in);

    public void in(){
        System.out.print("\nEnter product id: ");
        prod_id = reader.nextInt();
        System.out.print("Enter product name: ");
        name = reader.next();
        System.out.print("Enter product quantity: ");
        qty = reader.nextInt();
        System.out.print("Enter price: ");
        price = reader.nextFloat();
    }
    public void op(){
        float tot=qty*price;
        System.out.print("\n" +prod_id+"             "+name+"                 "+qty+"                 "+price+"              "+tot);
    }

    public float calcul(){
        net=qty*price;
        return net;
    }
}
class interfacebill{
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int i,n,order_no;
        System.out.print("Enter order number: ");
        order_no = reader.nextInt();
        Date date=new Date();
        System.out.print(" Enter number of products: ");
        n = reader.nextInt();
        bills c = new bills();
        bills b[] = new bills[n];
        // b.op(prod_id,name,qty,price);
        // b.calcul(qty,price);
        for (i = 0; i < n; i++) {
            b[i] = new bills();
            b[i].in();
        }
        System.out.print(" \n\nORDER NUMBER: " +order_no);
        System.o
ut.print(" \nDATE: " +date.toString());
        System.out.print("\nPRODUCT ID        NAME        QUANTITY         UNIT PRICE        TOTAL");
        System.out.print("\n---------------------------------------------------------------------------");
        for (i = 0; i < n; i++) {
            b[i].op();
        }
        System.out.print("\n--------------------------------------------------------------------------");
        float totalnet = 0;
        for (i = 0; i < n; i++) {
            b[i].calcul();
            totalnet = totalnet + b[i].net;
        }
        if(i==n) {
            System.out.print("\nNET AMOUNT: "+totalnet);
        }
    }
}