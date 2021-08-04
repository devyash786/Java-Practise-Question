import java.util.Scanner;
class SortAsc
{
  public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     int n,i,count=0,j;
	 System.out.println("Enter number of elements");
	 n=sc.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter elements");
	 for(i=0;i<n;i++)
	   a[i]=sc.nextInt();
	  for(i=0;i<n;i++)
	    for(j=0;j<n;j++)
		  {
		    if(a[i]<a[j])
			{ int temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			 }
         }
		 System.out.println("Sorted Array:");
	 for(i=0;i<n;i++)
	   System.out.print(a[i]+" ");
		 
}
}		 