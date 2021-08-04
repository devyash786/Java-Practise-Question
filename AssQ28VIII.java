class AssQ28VIII
{
  public static void main(String args[])
  {
    int i,j,k,l;
	for(i=1;i<=5;i++)
	{
	  for(j=1;j<=5-i;j++)
	   {
	     System.out.print("  ");
	   }
	  for(k=1;k<=i;k++)
       {
	     System.out.print(k);	  
	    }
      for(l=k-2;l>0;l--)
     {
        System.out.print(l);
       }	
	  System.out.println();
	 }
	 
	   
  }
}  