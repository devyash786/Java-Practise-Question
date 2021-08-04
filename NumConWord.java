import java.util.Scanner;
class NumConWord
{
  public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    int ch=0,word=0;
    System.out.println("Enter String");
	String s=sc.nextLine();
	String ag[]=s.split("\\s+");
	for(int i=0;i<ag.length;i++)
	 {
	   if(ag[i].length()==1)
	    ch++;
		else
		word++;
    }
	System.out.println("Number of characters:"+ch);
	System.out.println("Number of words:"+word);
	}
}	