/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class Application {
	public static void main(String[]args) {
	/**
	 * Variable Instantiation
	 */
	Queue<String> line = new Queue<String>();
	String Bill = new String("Bill");
	String Alice = new String("Alice");
	String Bob = new String("Bob");
	String Jane = new String("Jane");
	String Hamad = new String("Hamad");
	String Jim = new String("Jim");
	
	/**
	 * Start of Program 
	 */
	System.out.println("Welcome to VegeBurger Palace!");
	
	/**
	 * Enqueing of Bill, Alice, and Bob
	 */
	
	line.enqueue(Bill);
	line.enqueue(Alice);
	line.enqueue(Bob);
	
	System.out.println("Bill, Alice, and Bob have entered the line");
	System.out.println("In Line: " + line);

	
	/**
	 * Dequeing - 1 customer
	 */
		
	System.out.println(line.dequeue() + " has been served");
	System.out.println("In Line: " + line);
	
	/**
	 * Enqueing of Jane and Hamad
	 */
	
	line.enqueue(Jane);
	line.enqueue(Hamad);
	
	System.out.println("Jane and Hamad have entered the line");
	System.out.println("In Line: " + line);
	
	/**
	 * Dequeing - 2 customers
	 */
		
	System.out.println( line.dequeue() + " and " + line.dequeue() + " have been served");
	System.out.println("In Line: " + line);
	
	/**
	 * Enqueing of Jim
	 */
	
	line.enqueue(Jim);
	
	System.out.println("Jim has entered the line");
	System.out.println("In Line: " + line);
		
	/**
	 * Dequeing - 2 customers
	 */
	
	System.out.println( line.dequeue() + " and " + line.dequeue() + " have been served");
	System.out.println("In Line: " + line);
	
	}
}