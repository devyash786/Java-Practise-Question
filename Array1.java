import java.util.Scanner;
class Array1
{
  public static void main(String args[])
  { int i,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
	int x=sc.nextInt();
	System.out.println("Enter the elements");
	int q[]=new int[x];
    for(i=0;i<x;i++)
     {
     	 q[i]=sc.nextInt();
		 sum=sum+q[i];
     }	
	 System.out.println("Average is"+" "+(sum/x));
	 System.out.println("Elements above average");
	  for(i=0;i<x;i++)
     {
     	 if(q[i]>=(sum/x))
		  System.out.println(q[i]);
     }	
  }
}  
	
	