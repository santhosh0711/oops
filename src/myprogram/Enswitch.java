package myprogram;
public class Enswitch {


	public static void main(String[] args) {
		
		int itemcode=2;
	
		
		
		switch(itemcode)
		{
		
		case 1, 2, 3:
			System.out.println("good morning");
		    break;
		    
		case 4, 5, 6:
			System.out.println("good night");
	        break;
		default:
			System.out.println("Bye Bye");
			break;
		}
		
	}
	
}
