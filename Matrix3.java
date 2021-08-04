import java.util.Scanner;
class Matrix3{
 public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   int m,n,m1,n1;
   System.out.println("Enter the order of M1");
    m=sc.nextInt();
    n=sc.nextInt();
	System.out.println("Enter the order of M2");
    m1=sc.nextInt();
    n1=sc.nextInt();
   	int a[][]=new int[m][n];
	int b[][]=new int[m1][n1];
	if(n==m1)
	{System.out.println("----Matrix1----");
	for(int i=0;i<m;i++)
	  for(int j=0;j<n;j++)
	     a[i][j]=sc.nextInt();
    System.out.println("----Matrix2----");
	for(int i=0;i<m1;i++)
	  for(int j=0;j<n1;j++)
	     b[i][j]=sc.nextInt();		 
	
	 int c[][]=new int[m][n1];
     System.out.println("Product is:");
      for(int i=0;i<m;i++)
    {
      for(int j=0;j<n1;j++)
       {
	     for(int k=0;k<n;k++)
     	   c[i][j]=c[i][j]+a[i][k]*b[k][j];
	     System.out.print(c[i][j]+" ");
       }System.out.println();
    }
}
       else
	   System.out.println("Matrix Multiplication not possible");
}	
}
    	 
		 
   