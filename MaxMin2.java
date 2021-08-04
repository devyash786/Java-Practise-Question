class MaxMin2
{
  public static void main(String args[])
   {
     int a=(int)(Math.random()*100);
	 int b=(int)(Math.random()*100);
	 int c=(int)(Math.random()*100);
	 int d=(int)(Math.random()*100);
	 System.out.println(a+","+b+","+c+","+d);
	 if(a>b && a>c && a>d)
	  {  System.out.println("Largest No is:"+a);
	     if(b>c && b>d)
		  {
		    System.out.println(" 2nd Largest No is :"+b);
		  }
         else if(c>b && c>d)
          System.out.println(" 2nd Largest No is :"+c);	
		else
          System.out.println(" 2nd Largest No is :"+d);		
	  }	  
	 else if(b>a && b>c && b>d)
	  {  System.out.println("Largest No is:"+b);
	     if(a>c && a>d)
		  {
		    System.out.println(" 2nd Largest No is :"+a);
		  }
         else if(c>a && c>d)
          System.out.println(" 2nd Largest No is :"+c);	
		else
          System.out.println(" 2nd Largest No is :"+d);		
	  }	  
	   else if(c>b && c>a && c>d)
	  {  System.out.println("Largest No is:"+c);
	     if(b>a && b>d)
		  {
		    System.out.println(" 2nd Largest No is :"+b);
		  }
         else if(a>b && a>d)
          System.out.println(" 2nd Largest No is :"+a);	
		else
          System.out.println(" 2nd Largest No is :"+d);		
	  }	  
	 else
	  {  System.out.println("Largest No is:"+d);
	     if(b>c && b>a)
		  {
		    System.out.println(" 2nd Largest No is :"+b);
		  }
         else if(c>b && c>a)
          System.out.println(" 2nd Largest No is :"+c);	
		else
          System.out.println(" 2nd Largest No is :"+a);		
	  }	   
	}
}	