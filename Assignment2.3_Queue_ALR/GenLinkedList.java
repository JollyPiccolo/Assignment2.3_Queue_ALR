/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class GenLinkedList<T> {
	
	/**
	 * Variable Instantiation
	 */
	GenNode<T> head;
	int length;
	GenNode<T> tail;
	
	/**
	 * Constructor Instantiation
	 */
	public GenLinkedList(){
		head = null;
		length = 0;
		tail = head;
	}
	
	/**
	 * Accessor 
	 * checks the list to see if its empty
	 * @return True if the list is empty, otherwise returns false
	 */
	public boolean isEmpty()
	{
		if (head == null) { return true;}
		else return false;
	}
	
	/**
	 * Accessor
	 * returns the first node in the list
	 * @return GenNode head
	 */
	public GenNode<T> getList()
	{
		return head;
	}
	
	/**
	 * Mutator
	 * adds a node to the end of the list
	 * @param aNode
	 */
	public void addNode(GenNode<T> aNode){
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode = aNode;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;
		
	}
	/**
	 * Mutator
	 * removes a node from the front of the list
	 * @return 
	 */
	public GenNode<T> removeHead(){
		GenNode<T> output = head;
		
		if(head == tail) {
			head = null;
		}
		else{
			head = head.getNextNode();
		}
		length--;
		return output;
	}
	
}
