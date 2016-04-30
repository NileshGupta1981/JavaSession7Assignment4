import java.util.Scanner;

public class Session7Assignment4 {
	
	public static void main (String args[]){
		Scanner scnr = new Scanner(System.in);
		String str = new String ("Hello World");
		System.out.println ("Enter the string position");
		try{
		System.out.println ("Index postion is "+ str.charAt(scnr.nextInt()));
		}
		catch (StringIndexOutOfBoundsException E){
			System.out.println ("Please enter correct index of string");
			
		}
		finally {
			scnr.close();
			
		}
		
	}
	
	
	
}