package pack1;
public class Student
{                     public int rolln=26;
                        public String name="DevYash";
}
           
                       
package pack2;
public interface Sports
{
            void show();
                                   
}
package Record;
import pack1.*;
import pack2.*;
class sports implements Sports
{
            public void show()
            {
                        System.out.println("Cricker");
                   
            }
}



class Report
{
            public static void main(String args[])
            {
                        Student st1=new Student();
                        sports st2=new sports();
                        System.out.print("Rollnumber: "+st1.rolln+ "\tname "+st1.name);
                       
                        s2.show();
            }
}	