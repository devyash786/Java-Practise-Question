class NumNote1
{
  public static void main(String args[])
   { int R[]={50,25,20,10,5},m,temp,i,sum=0;
      m=(int)(Math.random()*10);
	  System.out.println(m);
	  temp=m*100;;
	  for(i=0;i<5;i++)
	  { int x=temp/R[i];
	    if(x!=0)
	    {System.out.println( R[i] +" " +" coins are "+(temp/R[i]));
	    sum=sum+temp/R[i];
		
		}
	  temp=temp%R[i];
	 }
	System.out.println( "Total notes are: " +" " +sum); 
}
}	 