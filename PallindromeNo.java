import java.util.Scanner;
class PallindromeNo
{
  public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter number ");
      int x=sc.nextInt();
	  int y=x,r,i,sum=0;
	  while(y>0)
	  {r=y%10;
	   sum=sum*10 +r;
	   y=y/10;
	  }
	  if(sum==x)
	 System.out.println("Palindrome");
	 else 
	 System.out.println("Not Palindrome");
    }
}	
   	  