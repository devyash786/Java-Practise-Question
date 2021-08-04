import java.util.Scanner;
class Factor
{
  public static void main(String args[])
    {
	  int x,i;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number");
	  x=sc.nextInt();
	  System.out.println("Fatcors are:");
	  for(i=1;i<=x/2;i++)
	  {
	    if(x%i==0)
		{ System.out.println(i);
        }
       }
}}	   
		 