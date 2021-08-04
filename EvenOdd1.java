class EvenOdd1
{
  public static void main(String args[])
    {  int count=0;
	  int x=(int)(Math.random()*100);
	  int y=(int)(Math.random()*100);
	  int z=(int)(Math.random()*100);
	  int w=(int)(Math.random()*100);
	  System.out.println(x+","+y+","+z+","+w);
	  if(x%2==0)
      count++;
	  if(y%2==0)
      count++;
	  if(z%2==0)
      count++;
	  if(w%2==0)
      count++;
	 System.out.println("Even number are: "+count);
	 System.out.println("Odd number are: "+(4-count));
	 
     }
}	 
	  
	  