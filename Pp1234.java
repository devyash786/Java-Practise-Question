class Rational
{
  int Numerator;
  int Denominator;
  Rational()
  { 
   Numerator=1;
   Denominator=1;   
  }
  Rational(int Numerator,int Denominator)
  { this.Numerator=Numerator;
	this.Denominator=Denominator; 
   }
   void setValue(int Numerator,int Denominator)
   { 
     new  Rational(Numerator,Denominator);
    }
  	void show()
	{
	  System.out.println(Numerator+"/"+Denominator);
	 }
 }
class Pp1234
{
   public static void main(String args[])
    {
	  Rational r=new Rational(3,4);
	  r.show();
	 }
}	 
   
   
  