import java.util.Scanner;
class MaxArray
 {
  public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
	  int n,i,j;
     int max=0;
	  System.out.println("Enter the Number of elements");
	  n=sc.nextInt();
	  int A[]=new int[n];
	  System.out.println("Enter the  elements");
	  for(i=0;i<n;i++)
	   {
	     A[i]=sc.nextInt();
	   }
	 
	  for(i=0;i<n;i++)
	  {
	    max=i;
		for(j=1;j<n;j++)
		 {
		   if(A[j]>A[i])
		     {
			   max=j;
			  }
			 
		  }       }
	    System.out.println("Maximum is::"+(A[max])); 

	}}	