import java.util.Scanner;
public class Matrixsym{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int row,col,i,j,flag=1;
	System.out.println("enter the number of rows");
	row=sc.nextInt();
	System.out.println("enter the number of columns");
	col=sc.nextInt();
	int mat[][]=new int[row][col];
	System.out.println("enter the elements in matrix:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		mat[i][j]=sc.nextInt();
	}
	System.out.println("Transpose of matrix is:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		 System.out.print(mat[i][j]+"\t");
	 System.out.println();
	}
	if(row!=col)
	{
		System.out.println("the given matrix is not a square matrix");
	}
	else
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
		if(mat[i][j]!=mat[j][i])
		flag=0;
		break;
		}
	}
	if(flag==1)
	{
		System.out.println("the matrix is symmetric");
	}
	else
	{
		System.out.println("the matrix is not symmetric");
	}
	}
}