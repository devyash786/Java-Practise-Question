import java.util.Scanner;
class Power
{
  public static void main(String args[])
   {
     int x,y,i,m=1;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number 1");
     x=sc.nextInt();
     System.out.println("Enter Number 2");
	 y=sc.nextInt();
	 for(i=1;i<=y;i++)
	   {
	     m=m*x;
		}
	System.out.println(x+"\t res to power\t"+y+"\t is"+m);
}
}	