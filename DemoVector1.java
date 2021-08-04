import java.util.*;
class  DemoVector1
{     public static void main(String args[]) 
    {    Vector vec = new Vector();
          String str,item;
          int i,j,len,ch,pos;
          len=args.length;
          for(i=0;i<len;i++)
              vec.addElement(args[i]);
          while(true)
          {
               System.out.println("\nSelect option");
               System.out.println("1) Delete  Item");
               System.out.println("2) Add Item at Specified Location ");
               System.out.println("3) Add Item at  the End of the list");
               System.out.println("4) Print Vector List ");
               System.out.println("5) Exit");
               System.out.print("Enter choice : ");
               Scanner sc=new Scanner(System.in);
                   str=sc.nextLine();
                   ch=Integer.parseInt(str);
                   switch(ch)
                   {
                       case 1 :    System.out.print("Enter Item you want to delete : ");
                                           str=sc.nextLine();
                                        vec.removeElement(str);  
                                        break;
                      case 2 :     System.out.print("Enter Item to be Insert : ");
                                        
                                        item=sc.nextLine();
                                        System.out.print("Enter Position to insert item : ");
                                        str=sc.nextLine();
                                        pos=Integer.parseInt(str);
                                        vec.insertElementAt(item,pos-1);
                                        break;
                      case 3 :     System.out.print("Enter Item to be Insert : ");
                                        
                                        item=sc.nextLine();
                                        vec.addElement(item);
                                        break;
                     case 4 :           len=vec.size();
                                        System.out.println("\nList is ");
                                        for(i=0;i<len;i++)
                                        {
                                               System.out.print(vec.elementAt(i)+" ");
                                        }
                                        break;
                      case 5 :     
                                        System.exit(0);
                                        break;
                     
                   
				   }
               
         }      
    }
}
