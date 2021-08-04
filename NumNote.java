class NumNote
{
  public static void main(String args[])
   { int R[]={2000,500,100,50,20,10,5,2,1},m,temp,i,sum=0;
      m=(int)(Math.random()*10000);
	  System.out.println(m);
	  temp=m;
	  for(i=0;i<9;i++)
	  { int x=temp/R[i];
	    if(x!=0)
	    {System.out.println( R[i] +" " +" note are : "+(temp/R[i]));
	    sum=sum+temp/R[i];
		
		}
	  temp=temp%R[i];
	 }
	System.out.println( "Total notes are: " +" " +sum); 
}
}	 
	   
     