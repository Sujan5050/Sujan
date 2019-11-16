package javaSessionTwoPkg;

public class PatternFour {
public static void main(String[] args) {
	for(int row=1;row<=3;row++)
	{
		  
		 for(int sp=3;sp>=row;sp--)
		 {
			 System.out.print(" ");
		 }
		 
		   for(int c=row;c>=1;c--)
			   	System.out.print(c);
                
           for(int a=1;a<=row;a++)
            	 System.out.print(a);
         
         System.out.println();
          
	}
    
}
}
