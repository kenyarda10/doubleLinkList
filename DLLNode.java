package doubleLinkList;

public class DLLNode<T> extends DrefUnsortedList2<T>{
	
	protected DLLNode<T> previous;  //in the book, it only has the back methods.  Using this 
							   //variable for a front.
	protected DLLNode<T> next;  
	protected T info;
	
	
	public DLLNode(T info)
	{
		this.info = info;
		
	}
	
	
			
	
}
