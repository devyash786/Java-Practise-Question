import java.util.Scanner;
class ShiftArray2
{
  public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     int n,i;
	 System.out.println("Enter number of elements");
	 n=sc.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter elements");
	  for(i=0;i<n;i++)
	   a[i]=sc.nextInt();
	   int temp=a[0];
	  for(i=0;i<n-1;i++)  
	   a[i]=a[i+1];
	   a[n-1]=temp;
	   System.out.println("After Left Shift");
	    for(i=0;i<n;i++)  
		System.out.print(a[i]+" ");
     }
}	 