import java.util.Scanner;
class RemoveSpace
{
   public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the string");
	  String s=sc.nextLine();
	  s=s.replaceAll("\\s+"," ");
	  System.out.println("Final  is:: "+ s);
	 }
}	 
	  