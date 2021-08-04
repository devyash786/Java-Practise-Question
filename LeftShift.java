import java.util.Scanner;
class LeftShift
{
  public static void main(String args[])
   { Scanner sc= new Scanner(System.in);
     System.out.println("Enter Number of Elements");
	 int n=sc.nextInt();
	 int a[]=new int[10];
	 System.out.println("Enter array");
	 for(int i=0;i<n;i++)
	 {
	   a[i]=sc.nextInt();
	 }
	 System.out.println("----------------------");
	 System.out.println("Entered array is");
	 for(int i=0;i<n;i++)
	 {
	   System.out.print(a[i]+" ");
	 }
	 for(int i=n-1;i>0;i--)
	 {
	  a[i-1]=a[i];
	  
	 }
	 System.out.println("----------------------");
	 System.out.println("Shifted array is");
	 for(int i=0;i<n;i++)
	 {
	   System.out.print(a[i]+" ");
	 }
}
}	 
	   
	 
     