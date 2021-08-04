import java.util.Scanner;
class  NumInterval
{ public static void main(String args[])
 {
  int x,y,count=0,r;
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter the Multiple digit Number" );
  x=sc.nextInt();
  System.out.println("Enter the Single digit");
  y=sc.nextInt();
 
  int z=x;
  while(z>0)
  { r=x%10;
    if(r==y)
	 { count++;
	   
     }
    z=z/10;	 
  }
  System.out.print("\n"+ y +"has occured"+count+"times");
}
}  
  