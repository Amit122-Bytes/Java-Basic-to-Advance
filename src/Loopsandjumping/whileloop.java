package Loopsandjumping;

public class whileloop {

	public static void main(String[] args) {
	
			int i=1;
			
			while(i<=10)// first check the condition then enter the block of codes
			{
				System.out.println(i);
				i++; // if you do not write this line it will print 1 for infinite time. (i=i+1)
			}
			
			System.out.println("Completed");
	}

}
