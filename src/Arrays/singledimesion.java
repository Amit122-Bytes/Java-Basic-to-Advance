package Arrays;

public class singledimesion {

	public static void main(String[] args) {
		
		int a[]=new int [5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[4]);
		
		//another way to print
		
		for(int i=0;i<=4;i++)//Print using for loop
		{
			System.out.println(a[i]);
		}
		
		for (int i:a)//Print using for..each loop
		{
			System.out.println(i);
		}

	}

}
