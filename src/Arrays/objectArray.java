package Arrays;

public class objectArray {

	public static void main(String[] args) {
		
		//Object a[]=new Object[5];
		Object a[]= {100,345,400.6,"Welcome",'G'};// you can also declare by this
		
		a[0]=10;
		a[1]=20.6;
		a[2]="Welcome";
		a[3]="G";
		a[4]=true;
		
		for(Object i:a)
		{
			System.out.println(i);
		}
	}

}
