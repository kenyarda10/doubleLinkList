package doubleLinkList;

import java.util.*;

public class ITDDLink {

	public static void main(String[] args) {
		
		DrefUnsortedList2<String> list = new DrefUnsortedList2<String>(); 
		int number = 1;
		
		Scanner conIn = new Scanner (System.in);
		
		System.out.println("Doubly Linked List\n");
		
		
		while (number != 0){
		
		
			System.out.println("Select a number to test");
			System.out.println("1. Add Element");
			System.out.println("2. Remove Element");
			System.out.println("3. Contains Element?");
			System.out.println("4. Get Size");
			System.out.println("5. Get Next Element");
			System.out.println("6. Get Previous Element");
			System.out.println("7. reset");
			System.out.println("8. toString");  //This works on the second tester but not this one and I don't know why
			System.out.println("9. Print Back");
			System.out.println("0: Press 0 to Stop Test");
			
			int choice = conIn.nextInt();
			switch (choice)
			{
			case 1:	System.out.println("Enter a String: ");
			list.add(conIn.next());
			break;
			
			case 2: System.out.println("Enter String to remove: ");
			list.remove(conIn.next());
			break;
			
			case 3: System.out.println("Enter a String from list to find: ");
			String response = conIn.next();
			list.contains(response);
			break;
			
			case 4: System.out.println("Size is " + list.size());
			break;
			
					
			case 5: System.out.println("Next element is: " + list.getNext());
			break;
			
			case 6: System.out.println("Enter a string from the list: " );
			String pre = conIn.next();
			System.out.println(list.getPrevious(pre));
			break;
			
			case 7: System.out.println("Resetting");
			list.reset();
			break;
			
			case 8:
				System.out.println(list.toString());
			break;
			
				
			case 9: System.out.println("Print Back: ");
			list.printBack();
			System.out.println();
			break;
			
			case 0: System.out.println("End of Test...");
			number = conIn.nextInt();
			break;
			
			default: System.out.println("Please enter valid choice from selection: ");
			return;
			}
			
			
			
		}conIn.close();
		}
		
		
		
	

	

}
