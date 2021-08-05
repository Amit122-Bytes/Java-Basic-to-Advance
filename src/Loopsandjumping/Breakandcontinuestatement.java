package Loopsandjumping;

public class Breakandcontinuestatement {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++)
		{
			if(i==5)
			{
				
				//break;// it will stop printing others number(1-4 will print)
				continue;// it will print 1-10
			}
			System.out.println(i);
		}
		

	}

}
