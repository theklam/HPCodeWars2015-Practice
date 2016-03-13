import java.io.File;
import java.io.*;
import java.util.*;
public class prob07 {
	
	public static void main(String[] args) {
		
		
		try {
			Scanner in = new Scanner(new File("prob07.txt"));
			
			
			while(in.hasNext()) {
				
				double r = in.nextDouble();
				r = Math.pow(r, (double) 2/3);
				if(r!=0) {
					System.out.println(r);				
				}
		
			}
		}
		
		catch(IOException e) {
			System.out.println("error" + e.getMessage());
		}
		

	}

}