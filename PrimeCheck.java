import java.util.Scanner;
class PrimeCheck
{
  public static void main(String args[])
    {
	  int x,i,count=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number");
	  x=sc.nextInt();
	  System.out.println("Fatcors are:");
	  for(i=2;i<=x/2;i++)
	  {
	    if(x%i==0)
		{ 
		    count++;
        }
       }
	 if(count==0)
      { System.out.println( x+" "+"is prime");}
    else
	System.out.println( x+" "+"is not prime");
}}	   
		 