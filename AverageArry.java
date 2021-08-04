import java.util.Scanner;
class AverageArry
{
 public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     int n,sum=0,i;
	 System.out.println("Enter number of elements");
	 n=sc.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter elements");
	 for(i=0;i<n;i++)
	 {
	   a[i]=sc.nextInt();
	   sum=sum+a[i];
	 }
	 System.out.println("Average:"+(sum*1.0)/n);
	 System.out.println("Elements above average are:");
	 for(i=0;i<n;i++)
	 {
	    if((double)a[i]>(sum*1.0)/n)
		    System.out.println(a[i]+"");
	 }
	}
}	
	