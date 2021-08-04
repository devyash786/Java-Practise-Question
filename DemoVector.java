import java.util.*;
class  DemoVector
{    public static void main(String args[]) 
    {      Vector vec=new Vector();
          for(int i=0;i<args.length;i++)
           vec.addElement(args[i]);
           System.out.println("Your Shopping list is:");
             for(int i=0;i<args.length;i++)
          System.out.print(vec.elementAt(i)+" ");
      }
}