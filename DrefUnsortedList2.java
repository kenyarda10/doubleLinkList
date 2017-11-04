package doubleLinkList;

import ch06.lists.ListInterface;

public class DrefUnsortedList2<T> implements ListInterface<T> {

	int count;
	protected boolean found;
	protected DLLNode<T> root;
	protected DLLNode<T> temp;
	protected DLLNode<T> current;
	
	
	public DrefUnsortedList2(){
		
		count = 0;
		root = null;
		current = null;
	}
	
	
		
	public int size() {
		
		return  count++;
	}

	
	public void add(T element) {
		DLLNode<T> newNode = new DLLNode<T>(element);
		if (root == null){
			root = newNode;
			root.previous = null;
			root.next = null;
		}
		else
		{ current = root;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = newNode;
			newNode.previous = current;
			newNode.next = null;
		
		}	
			
		count++;
	}
	
	protected void find(T target)
	
	{
		found = false;
		for (current = root; current != null; current = current.next)
		{
			if (current.info.equals(target)){
				found = true;
			}
		} 
			
	  }


	
	public boolean remove(T element) {
		find(element);
	    if (found)
	    {
	    	if (current == root)
	    		current = null;
	    	else {
	    		if (root.next == current)
	    			current = current.previous;
	    			    		
	    	count--;
	    	
			}
	    	
	    }
	    return found;
	}

	
	public boolean contains(T element) {
		find(element);
		return found;
	}

	
	public T get(T element) {
		
		find(element);    
	    if (found)
	      return temp.info;
	    else
	      return null;
	}

	
	public void reset() {
		if (current != null)
		      current = current.previous;
		
	}
	
	public void resetBack()
	  {
		  
	        if (root != null){
	          root = root.next;
	        }
	  }

	
	public T getNext() {
		current = root;
		
			temp = root.next;
		
			if(temp != current)
			{	
		return temp.info; 
			
			
		}
		else
		  return null;
		
	}
	
	public T getPrevious(T element) {
		current = root;
		if (found)
		temp = current.previous;
		if (temp != current){
		return current.info;
		}
		else{
			return null;
		}
	}
	
	public void printBack()
	{
		 resetBack();
		current = root;
		boolean display = true;
		
		while(current.next!=null){
			
			current = current.next;
			
		}
		
		do{
			
			System.out.print((display) ? "|" + current.info + "|" : " == " + "|" + current.info + "|" );
			
			display = false;	
			
			current = current.previous;
			
		}while(current.previous!=null);
		
		System.out.print(" == " + "|" + current.info + "|" );
		
		
	
	}
	
	public String toString()
	  // Returns a nicely formatted string that represents this list.
	  {
		StringBuilder sb = new StringBuilder("(");
	    
	    DLLNode<T> print = root.next;
	    while (print != current)
	    {
	    	sb.append(print.info);
	    	print = print.next;
	    	
	    	if (print != current)
	    		sb.append("-->");
	    	
	    }
	     
		
		
		sb.append(") ");
		return sb.toString();
	  }  
	


}
