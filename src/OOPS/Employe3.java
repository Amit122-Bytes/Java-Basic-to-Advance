package OOPS;

public class Employe3 {

	// properties as local variables
		int empid;
		String empname;
		int salary;
		int deptno;
		
		void setdata(int id, String name, int sal, int dept)// using method
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
	
		Employe3 e1=new Employe3();
		e1.setdata(101, "Amit", 20000, 10);
		e1.display();

	}
	
	// This is example of How we can directly declare class variables using object

}
