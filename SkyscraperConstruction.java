import java.util.Scanner;
import java.util.Stack;

public class SkyscraperConstruction {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the total number of floors in the building:");
	        int totalFloors = scanner.nextInt();
	        
	        Stack<Integer> floorStack = new Stack<>();
	        
	        for (int i = 1; i <=totalFloors; i++) {
	            System.out.println("Enter the floor size given on day " + i + ":");
	            int floorSize = scanner.nextInt();
	            
	            // Your code logic goes here
	            if (floorStack.isEmpty()) {
	        	    floorStack.push(floorSize);
	        	} else {
	        	    // Compare the floorSize with the top floor in the stack
	        	    while (!floorStack.isEmpty() && floorSize > floorStack.peek()) {
	        	        System.out.print(floorStack.pop() + " ");
	        	    }
	        	    floorStack.push(floorSize);
	        	}
	            
	            // Print the stack contents after each iteration
	            System.out.println("Day " + i + ": " + floorStack);
	        }
	        
	        scanner.close();   
	    
	}
		
}
	
