package myprogram;

public class Jmpstmt {

	    public static void main(String[] args) {
	        
	        int lim=100, i=1;
	        
	        
	          while(i<=lim)
	          { 
	              if(i==50) 
	              { 
	                  break; 
	                  } 
	              
	              System.out.print(i+ " "); 
	              i=i+1; 
	        }
	         
	        
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        
	        i=1;
	        while(i<=lim)
	        { 
	           i=i+1;
	            if(i==50)
	            {
	                continue;
	            }
	            System.out.print(i+ " ");
	        }
   }

}
