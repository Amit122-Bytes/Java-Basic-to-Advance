package Arrays;

public class readarrayproperties {

	public static void main(String[] args) {
		
		String[]s=new String[3];
		
		s[0]="Hello World";
		s[1]="Amit";
		s[2]="Office";
		
		System.out.println(s.length);//0-2 it will return 3
		
		for(String i:s)//print via for each loop
		{
			System.out.println(i);
		}
		
		
	}

}
