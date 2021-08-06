package OOPS;

public class Employe {// class

	// properties as local variables
	int empid;
	String empname;
	int salary;
	int deptno;

	void display()// method
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}

	public static void main(String[] args) {
		Employe e1 = new Employe();// create an object
		e1.empid = 101;
		e1.empname = "Amit";
		e1.salary = 2000;
		e1.deptno = 2;
		e1.display();// Method calling

	}

	// This is example of How we can directly declare class variables using object

}
