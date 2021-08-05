package Arrays;

public class twodimesionalarray {

	public static void main(String[] args) {
		
		int a[][]= new int [3][2];//row=3 coloum=2 here
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		for (int i=0;i<=2;i++)//for row increment
		{
			for (int j=0;j<=1;j++)//for coloum increment
			{
				//System.out.println(a[i][j]);
				System.out.println(a[i][j]+"     ");
			}
			
			System.out.println();
		}
		
		//by for each loop
		
		for(int i[]:a)
		{
			for (int j:i)
			{
				System.out.println(j+"  ");
			}
		}
		
		
		

	}

}
