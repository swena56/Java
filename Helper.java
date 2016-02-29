
/**
 * @(#)Helper.java
 *
 *
 * @author 
 * @version 1.00 2016/2/29
 */
import java.io.*;

public class Helper {
    
     public String getUserInput(String prompt)
     {
     	String inputLine = null;
     	System.out.print(prompt + " ");
     	try {
     		BufferedReader is = new BufferedReader( new InputStreamReader(System.in));
     		inputLine = is.readLine();
     		if(inputLine.length() == 0) return null;
     		
     	} catch (IOException e) {
     		System.out.println("IOException: " + e);
     	}
     	
     	return inputLine;     	
     }
     
     
    /**
     * Creates a new instance of <code>Helper</code>.
     */
    public Helper() {
    	
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Helper helper = new Helper();
        helper.getUserInput("Enter a number:");
        
    }
    
}

