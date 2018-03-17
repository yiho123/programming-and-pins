public class Fraction implements Addable,Comparable{
 
  // method for finding the greatest common divisor of the parameters
  // e.g. gcd(15, 10) returns 5
  // You are recommended to pass positive parameters to this method
  // we will explain what "private" and "static" mean in later classes
  // you do not have to use this method if you do not want to
  private static int gcd(int a, int b) {

    if(a == 0 || b == 0) return a+b; // base case

    return gcd(b,a%b);
  }
  
  
  private int denominator;
  private int numerator;
  

  public Fraction(int x, int y ) {
	  numerator = x;
	  denominator = y;
	  
	  if (x == 0 || y == 0)
		  denominator = 1;
	  if (y < 0 && x > 0 || y < 0 && x < 0) {
		  denominator = denominator * -1;
	      numerator = numerator * -1;
	  }
int a = gcd (denominator, numerator);
denominator = denominator / a;
numerator = numerator / a;


	  
  }
  
  
  public double value() {
		
		return numerator / denominator;
		
	}
  
  
  
  
 public String toString() {
	  
	  
	  String f = numerator + "/" + denominator;
	  return f;
	  
  }
  
  
  public int compareTo(Object obj) {
	  
	  Fraction f = (Fraction)obj;
	  if(value() < f.value())
	  return -1;
	  else if (value() == f.value())
		  return 0;
	  else
		  return 1;
	  
	  
  }
 
  public Addable add(Addable obj) {
	  
	  Fraction f = (Fraction)obj;
	  int y = f.denominator * denominator;
	  int x = f.numerator * denominator + f.denominator*numerator;
	  Fraction a = new Fraction(x,y);
	  return a;
	  
  }
  
  
  
  
 
 
 
}
