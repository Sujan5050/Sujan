package javaSessionTwoPkg;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++)
		{
		 for(int sp=3;sp>=row;sp--)
		 {
			 System.out.print(" ");
		 }
		 for(int c=row;c>=1;c--)
		System.out.print(c);
				
		System.out.println();
		}
	}
}
	