package javaSessionTwoPkg;

public class PatternWhile {
 public static void main(String args[])
 {
	 int row=1;
	 	 while(row<=3){
	 		int col=1;
	 		 while(col<=row) {
			 System.out.print(col+" ");
		    	col++;
		 }
		 System.out.println();
		 row++;
	 	 }
	 
 }
}
/*for(int row=1;row<=3;row++)
{
for(int col=1;col<=row;col++)
{
	System.out.print(col+" ");
}
System.out.println();
}
*/