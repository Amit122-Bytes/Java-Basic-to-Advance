package strings;

public class allstringmethods {

	public static void main(String[] args) {

		//Length//
		
		String s= "Amit Meta";
		System.out.println(s.length());
		
		//Concatenation
		
		String s1="Amit";
		String s2="Meta";
		
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Amit"+"  "+s2);
		System.out.println("Amit".concat(s2));
		
		//Equals
		
		String s3="Amit";
		String s4= "Meta";
		String s5="Amit";
		String s6= "Amit";
		System.out.println(s3.equals(s4));
		System.out.println(s5.equals(s6));
		
		//contains
		
		System.out.println(s3.contains("ABC"));
		System.out.println(s3.contains("mi"));
		
		//substring remember Stating index will start from 0 and ending index will start from 1
		
		String a= "WELCOME";// For Starting index W=0, E=1.....so on for Ending index W=1,E=2....
		
		System.out.println(a.substring(0,4));//WELC
		System.out.println(a.substring(1,3));//EL
		
		//replace
		
		System.out.println(a.replace("E", "F"));//case sensetive remember
		
		System.out.println(a.replace("COME", "KOME"));
		
		
		
	}

}
