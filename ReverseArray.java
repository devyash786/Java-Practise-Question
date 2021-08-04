import java.util.Scanner;
class ReverseArray
{
 public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    int n,i;
	System.out.println("Enter number of elements");
    n=sc.nextInt();
	int a[]=new int[n];int b[]=new int[n];
	System.out.println("Enter elements");
	for(i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	  b[n-1-i]=a[i];
	 }
   System.out.println("Reverse array is:");
   for(i=0;i<n;i++)
	{ a[i]=b[i];
	  System.out.print(a[i]+" ");
	 }
}
}	 
	  
	
    