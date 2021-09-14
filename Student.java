import java.util.Scanner;
public class Student{
     public static void main(String  args[]) {
     String name;
     int roll;
     char[] branch;
    double mark;
    char grade;

    Scanner reader=new Scanner(System.in);
    System.out.print("Enter Name:");
    name=reader.nextLine();
    System.out.print("Enter Roll number:");
    roll=reader.nextInt();
    System.out.print("Enter mark:");
    mark=reader.nextDouble();
    System.out.print("Enter grade:");
    grade=reader.next().charAt(0);
    System.out.print("Enter branch:");
    branch=reader.next().toCharArray();
    System.out.println(" ");
    System.out.println("-------------------");
    System.out.println("STUDENT DETAILS");
    System.out.println("-------------------");
    System.out.print("Name:"+name+"\nRoll number:"+roll+"\nStudentmark:"+mark+"\nGrade:"+grade+"\nBranch:");
	for(int i=0;i<branch.length;i++)
	{
		System.out.print(branch[i]);
	}
}
}