package OOPS;

public class Employe2 {

	// properties as local variables
	int empid;
	String empname;
	int salary;
	int deptno;

	Employe2(int id, String name, int sal, int dept)// constructor name should be same as class name
	{
           empid=id;
           empname=name;
           salary=sal;
           deptno=dept;
	}
	
	void display()// method
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}

	public static void main(String[] args) {

		Employe2 e1=new Employe2(101,"Amit",2000,12);//constructor
		e1.display();//call method

	}
	
	//This is example of How we can directly declare class variables using constructor

}
