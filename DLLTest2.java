package doubleLinkList;

public class DLLTest2 {

	public static void main(String[] args) {
		DrefUnsortedList2<String> list = new DrefUnsortedList2<String>(); 
		
		 System.out.println("Size: " + list.size()); //size is working
		 //-----------------------------------------------------------------
		 list.add("Kenyarda");   //add is working
		 list.add("Jayden");
		 //-----------------------------------------------------------------
		 
		 list.add("BJ");
		 list.add("Stephanie");
		 System.out.println("GetPrev: " + list.getPrevious("Stephanie"));
		 //------------------------------------------------------------------
		 list.remove("Kenyarda");  // remove is working
		 //------------------------------------------------------------------
		System.out.println("GetNext: " + list.getNext()); //getNext working
		 
		//------------------------------------------------------------------ 
		 list.remove("Stephanie");
		 System.out.println(list.contains("Jayden")); //contains is working
		 System.out.println(list.contains("Kenyarda"));
		 //------------------------------------------------------------------
		 
		System.out.println("Size: " + list.size()); //size is working
		
		//------------------------------------------------------------------
		 System.out.println(list.contains("Keny"));
		
		list.reset();  //reset is working
		System.out.println(list.toString()); //toString is working
		System.out.println("------------------------------------");
		
		
		list.printBack();  //printBack is working

	}

}
