class AssQ28V
{
  public static void main(String args[])
  {
    int i,j,k,count=0;
	for(i=1;i<=5;i++)
	 {
	   for(j=1;j<=i;j++)
	   { count++;
	    if(count%2==0)
	       System.out.print("1");
		 else   
		 System.out.print("0");
	   }
	   for(k=1;k<=5-i;k++)
	   {
	     System.out.print(" ");
	   }
       System.out.println();
	   }
  }
}  