import java.util.Scanner;
class Matrix5{
 public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   int m,n;
   System.out.println("Enter the order");
    m=sc.nextInt();
    n=sc.nextInt();
   	int a[][]=new int[m][n];
	int b[][]=new int[m][n];
	System.out.println("----Matrix1----");
	for(int i=0;i<m;i++)
	  for(int j=0;j<n;j++)
	     a[i][j]=sc.nextInt();
    System.out.println("----Matrix2----");
	for(int i=0;i<m;i++)
	  for(int j=0;j<n;j++)
	     b[i][j]=sc.nextInt();		 
	a:for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
       { if(a[i][j]!=b[i][j])
	      { System.out.println("Matrix not same");
		     break a;
		  }
		  if(a[i][j]==b[i][j]&&i==m-1)
		  System.out.println("Matrix is same");
		   break a;
          }
	   
}
}
}	