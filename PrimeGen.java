import java.util.Scanner;
class PrimeGen
{
  public static void main(String args[])
    {
	  int x,i,count=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no till where you want lsit of prime number");
	  x=sc.nextInt();
	  System.out.println("Series of Prime number is");
	  for(int j=2;j<=x;j++)
	  { int n=j;
	      for(i=2;i<=n/2;i++)
	      {    if(n%i==0)
	        	{ 
		         count++;
                 }
	      }
		  if(count==0)
             { System.out.println(j);
	           
			 }
		count=0;	 
	  }
    }
}	   
		 