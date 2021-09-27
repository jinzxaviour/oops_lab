import java.util.*;
public class Stack_operations {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        do {
            System.out.println("Enter the operation you want to perform");
            System.out.println("\n1.Push\n2.Peek\n3.Pop\n4.Display Stack\n5.Exit\n ");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add");
                    int n1 = sc.nextInt();
                    s.push(n1);
                    break;

                case 2:
                    System.out.println("Top element is " + s.peek());
                    break;

                case 3:
                    s.pop();
                    System.out.println(s);
                    break;

                case 4:
                    System.out.println(s);
                    break;

                case 5:
                    System.out.println("Exit point!");
                    break;

                default:
                    System.out.println("Enter a valid choice!");
                    break;


            }
        } while (choice != 5);

    }
}