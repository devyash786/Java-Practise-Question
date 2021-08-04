class AssQ28VI
{
  public static void main(String args[])
  {
    int i,j,k,count=0;
	for(i=1;i<=5;i++)
	 {
	   for(j=1;j<=i;j++)
	   { if(count>9)
	      count=0;
	     System.out.print((count++)+" ");
	   }
	   for(k=1;k<=5-i;k++)
	   {
	     System.out.print(" ");
	   }
       System.out.println();
	   }
  }
}  