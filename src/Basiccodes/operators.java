package Basiccodes;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arithmetic Operators

		int a = 100;// Here a is a is variable and operands
		int b = 200;

		System.out.println(a + b);// here '+' , '-' etc all are operator
		System.out.println(b - a);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(b % a);
		
		//Relational operators
		
		System.out.println(a>b);// Relation operators always return boolean value
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical Operators
		
		boolean x= true;
		boolean y= false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		//Assignment operators
		
		int c;
		 c=a;
		 System.out.println(c);	 
		 c=b;
		 System.out.println(c);
		 
		 //increment operators
		 
		 int p=100;
		 p++;
		 
		 System.out.println(p);
		 
		 //decrement operators
		 
		 int q=100;
		 q--;
		 
		 System.out.println(q);
		 
		 //plus equal operator
		 
		 int m=500;
		 
		 m+=10;
		
		 System.out.println(m);
		
		 //minus equal operator
		 
		 int n=500;
		 
		 n-=10;
		
		 System.out.println(n);
		 
		//multiple equal operator
		 
		 int t=500;
		 
		 t*=10;
		
		 System.out.println(t);
		 
		 //divide equal operator
		 
		 int r=500;
		 
		 r/=10;
		
		 System.out.println(r);
		 
		}

}
