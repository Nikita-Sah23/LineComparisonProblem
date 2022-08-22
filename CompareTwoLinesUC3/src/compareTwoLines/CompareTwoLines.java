package compareTwoLines;

public class CompareTwoLines {

	public static void main(String[] args) {
		int x1 = 8;
		int x2 = 16;
		int y1 = 8;
		int y2 = 16;
		
		int a1 = 8;
		int a2 = 16;
		int b1 = 8;
		int b2 = 16;
	
		String z1 ="0";
		String z2 ="0";
				
		float Line1_Length =  (float) Math.sqrt( Math.pow (x2 - x1 ,2) + Math.pow (y2- y1 , 2));
			
		z1 =String.valueOf(Line1_Length);  
		
		System.out.println( "Line1_Length" );
		System.out.println( Line1_Length );
		
		float Line2_Length =  (float) Math.sqrt( Math.pow (a2 - a1 ,2) + Math.pow (b2- b1 , 2));
		
		z2 =String.valueOf(Line2_Length);
		
		System.out.println( "Line2_Length");
		System.out.println( Line2_Length );
		
		System.out.println(z1);
		System.out.println(z2);
		
		System.out.println(z1.compareTo(z2)); // if z2--> greater thn -ve , if z1-->greater thn +ve value
		
	 if (z1.compareTo(z2) > 0)
				
	{
		System.out.println(z1.compareTo(z2));				
			System.out.println("z1 line is greater");	
	}
		
		 else if (z1.compareTo(z2) < 0)
		{
			System.out.println(z1.compareTo(z2));
			System.out.println("z2 Line is greater");
		}
		else 
	 {
		 System.out.println("both line Equal" );
	 }
  }
}


