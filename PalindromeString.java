import java.util.Scanner;
class PalindromeString
{
  public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     System.out.println("Enter String");
	 String s=sc.nextLine();
	 int n=s.length();
	 String pd="";
	 for(int i=n-1;i>=0;i--)
	     pd=pd+s.charAt(i);
     if(pd.equalsIgnoreCase(s))
        System.out.println("Palindrome");
     else
        System.out.println("Not palindrome");
   }
}   
 	
    
     
 