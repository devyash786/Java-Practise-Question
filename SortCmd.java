class SortCmd
{
 public static void main(String args[])
  {
     for (int i = 0; i <args.length; i++) 
        {
            for (int j = i + 1; j <args.length; j++) 
            {
                if (args[i].compareToIgnoreCase(args[j])>0) 
                {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }}}
		System.out.println("Sorted Names:");
		for(int i=0;i<args.length;i++)
		  System.out.println(args[i]+" ");
	}
}	