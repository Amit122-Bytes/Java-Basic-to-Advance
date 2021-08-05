package Conditionalstatement;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=10;
		
		switch(day)
		{
		case 1: System.out.println("Monday");
		break;// we use break because switch-case run every-cases though condition is satisfied,
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");	
		break;
		default: System.out.println("Saturday");
		
		}

	}

}
