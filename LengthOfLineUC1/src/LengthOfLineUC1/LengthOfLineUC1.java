package LengthOfLineUC1;

public class LengthOfLineUC1 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int x1 = 2;
			int x2 = 4;
			int y1 = 2;
			int y2 = 4;			
			
			float Line1_Length =  (float) Math.sqrt( Math.pow (x2 - x1 ,2) + Math.pow (y2- y1 , 2));			
			
			System.out.println( "Line1_Length" );
			System.out.println( Line1_Length );	
	}

}
