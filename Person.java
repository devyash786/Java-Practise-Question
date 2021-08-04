class Person
{
 String fname;
 String  lname;
  Person()
  { 
    fname="";
    lname="";	
  }
  Person(String fname,String lname)
  { this.fname=fname;
	this.lname=lname;
   }
   void setValue(String fname,String lname)
   { 
     new Person(fname,lname);
    }
  	void show()
	{
	  System.out.println(this.fname+this.lname);
	 }
 }
class Pp123
{
   public static void main(String args[])
    {
	  Person p=new Person("Dev","Yash");
	  p.show();
	 }
}	 
   
   
  