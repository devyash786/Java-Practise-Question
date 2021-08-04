import java.util.Scanner;
class Histogram
{
  public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no of elements");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter the elements");
	 for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
	 System.out.println("Histogram is:");
	 for(int i=0;i<n;i++)
	   {
	    for(int j=0;j<a[i];j++)
		  {
		    System.out.print("*");
		  }
          System.out.println();
       }
    }
}	
	  
     