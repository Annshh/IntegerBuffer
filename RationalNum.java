
import java.io.*;
class RationalNum
{
  private  int numerator;
  private  int denominator;

  // default constructor to initialize the rational number to 0
  RationalNum()
  {
    // Please add your code here
	  this.numerator = 0;
	  this.denominator = 0;
  }

  // initialize the rational number to a/b
  RationalNum(final int a, final int b)
  {
   // Please add your code here
	  int numerator=a;
	  int denominator=b;
	  this.numerator = numerator;
		this.denominator = denominator;
  }

  // copy constructor that is used to initialize the number to ralNum
  RationalNum(final RationalNum ralNum)
  {
   // Please add your code here
 
     System.out.println("Copy constructor called"); 
     numerator = ralNum.numerator; 
     denominator = ralNum.denominator;
     
     
  }

  // display the number in the form of numerator/denominator
  void display()
  {
   // Please add your code here
	  System.out.println(numerator + "/" +denominator);
  }
  
  
  public static int gcd(int a, int b) 
  {
	  if (b == 0) 
	  {
			return a;
		}
		int r = a % b;
		return gcd(b, r);
	}
  
  public static void reduce(RationalNum rational) 
  {
		int gcd = gcd(rational.numerator, rational.denominator);
		rational.numerator = rational.numerator / gcd;
		rational.denominator = rational.denominator / gcd;
	}

// addition, returns the sum num1 + num2
  static RationalNum add(final RationalNum num1, final RationalNum num2)
  {
	  int newNumerator = (num1.numerator * num2.denominator)
				+ (num1.denominator * num2.numerator);
		int newDenominator = num1.denominator * num2.denominator;
		RationalNum newRational= new RationalNum(newNumerator, newDenominator);
	     	reduce(newRational);		
		return newRational;
  }

  // subtraction, returns the difference num1 - num2
  static RationalNum sub(final RationalNum num1, final RationalNum num2)
  {
   // Please add your code here
   //...
	  int newNumerator = (num1.numerator * num2.denominator)
				-( num1.denominator * num2.numerator);
		int newDenominator = num1.denominator * num2.denominator;
		RationalNum newRational = new RationalNum(newNumerator, newDenominator);
		reduce(newRational);
		return newRational;
  }

  // multiplication, returns the product num1 * num2
  static RationalNum mul(final RationalNum num1, final RationalNum num2)
  {
	  int newNumerator = num1.numerator * num2.numerator;
		int newDenominator = num1.denominator * num2.denominator;
		
		RationalNum newRational = new RationalNum(newNumerator, newDenominator);
		reduce(newRational);
		return newRational;
  }

  // division, returns the quotient num1/num2
  static RationalNum div(final RationalNum num1, final RationalNum num2)
  {
	  int newNumerator = num1.numerator * num2.denominator;
	int newDenominator = num1.denominator * num2.numerator;
		RationalNum newRational = new RationalNum(newNumerator, newDenominator);
		reduce(newRational);
		return newRational;
  }

  
  /* simplifying the rational number, the numerator and the denominator
     in the result should be relatively prime
  */
  void simplify()
  {
   // Please add your code here
//   ...
	  int count=0;
	  int count1=0;
	  for(int i=2;i<10;i++) {
		  
		  if(numerator%i==0) {
			  count++;
		  }
		  if(denominator%i==0) {
			  count1++;
		  } 
	  }
		  if(count==0&&count1==0) {
			  System.out.println("Relatively Prime");
		  }
		  else {
			  System.out.println("Not Relatively Prime");
		  }
	  
  }



//Please complete the above class and test it using the following code.
public static void main(String args[]) {
	RationalNum a = new RationalNum(2,3);
	RationalNum b = new RationalNum(6,4);

	RationalNum c = RationalNum.add(a,b);
	c.simplify();

	a.display();
	System.out.print(" + ");
	b.display();
	System.out.print(" = ");
	c.display();


	c = RationalNum.sub(a,b);
	c.simplify();

	a.display();
	System.out.print(" - ");
	b.display();
	System.out.print(" = ");
	c.display();


	c = RationalNum.mul(a,b);
	c.simplify();

	a.display();
	System.out.print(" * ");
	b.display();
	System.out.print(" = ");
	c.display();


	c = RationalNum.div(a,b);
	c.simplify();

	a.display();
	System.out.print(" / ");
	b.display();
	System.out.print(" = ");
	c.display();


	}
	}