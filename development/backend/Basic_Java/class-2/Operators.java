class Operators 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 2;
		
		System.out.print("Addition "); 
		System.out.println( a + b );
		System.out.println("Addition  "+  a + b );
		// Because jvm thought it string so we have to use () to tell  jvm that it is integer
		System.out.println("Addition  "+  (a + b ));

		
		
		System.out.println("Substruction 1  " +  a + b);
		System.out.println("Substruction 2 " +  (a - b));

		System.out.println( "Multiplication 1 " + a * b);
		System.out.println( "Multiplication 2  " + (a * b));
		
		System.out.println("Division 1 "+  a / b);		
		System.out.println("Division 2 "+  (a / b));
		
		System.out.println("Modulo 1 " +  a % b);
		System.out.println("Modulo 2 " +  (a % b));

		int c = a +b;
		System.out.println ( "Addition = " + c);


	}
}
