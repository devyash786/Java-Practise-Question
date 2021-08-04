import java.util.*;  
class StringTkn{  
 public static void main(String args[]){  
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String s=sc.nextLine();
	StringTokenizer sc1 = new StringTokenizer(s,"_");  
     while (sc1.hasMoreTokens()) {  
         System.out.println(sc1.nextToken());  
     }  
   }  
} 