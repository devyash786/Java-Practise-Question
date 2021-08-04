import java.util.Scanner;
class CountVowsConsta
{
 public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    int cons=0,vows=0;
	System.out.println("Enter String");
	String s=sc.nextLine();
	s=s.toLowerCase();
	for(int i=0;i<s.length();i++)
	{ 
    	if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u')
	    {vows++;}
	   else if(s.charAt(i)>='a' && s.charAt(i)<='z')
        cons++;
	   	
    }
    System.out.println("no of vowels:"+vows);
	System.out.println("no of const:"+cons);
	}
}	
	  
	