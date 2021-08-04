import java.util.Scanner;
class GCD
{
 public static void main(String args[])
 { int x,y,i,hcf=1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number 1");
   x=sc.nextInt();
   System.out.println("Enter number 2");
   y=sc.nextInt();
   for(i=1;i<=x ||i<=y;i++)
     {
	  if(x%i==0 && y%i==0)
	    hcf=i;
      }
	  System.out.println("HCF of "+x+" & "+y+" is "+hcf);   
   }  
}
    