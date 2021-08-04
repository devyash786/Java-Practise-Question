import java.util.Scanner;
class Matrix4{
 public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   int m,n;
   System.out.println("Enter the order");
    m=sc.nextInt();
    n=sc.nextInt();
   	int a[][]=new int[m][n];
	System.out.println("Enter the Matrix");
	for(int i=0;i<m;i++)
	  for(int j=0;j<n;j++)
	     a[i][j]=sc.nextInt();
	System.out.println("Transpose Matrix is:");
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
       System.out.print(a[j][i]+" ");
       System.out.println();
    }
}
}	