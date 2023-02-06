public class SLL_Driver {
	public static void main(String[] args) {
		SLL<String> myList = new SLL<String>();
    String[] cityNames = {"Jubail", "Riyadh", "Abha", "Dammam", "Taif"};
		for(int i = 0; i < cityNames.length; i++)
			myList.addToHead(cityNames[i]);
			
		// System.out.println("Original list: " + myList);
    // System.out.println("Element deleted from head: " + myList.deleteFromHead());
    // System.out.println("Modified list: " + myList);
    // System.out.println("It is " + myList.contains("Dammam") + " that the list contains Dammam.")

    //--------------------------------------------------------
    SLL<Integer> list = new SLL<>();
    list.addToTail(7);
    list.addToTail(5);
    list.addToTail(3);
    list.addToTail(50);
    list.addToTail(7);
    list.addToTail(9);
    System.out.println("\n***********************************************************************");
    System.out.println("Original Integer array: " + list);

    list.insertBefore(4, 20);
    System.out.println("After inserting 20 before index 4: " + list);

    System.out.println("Element deleted from index 4: " + list.delete(4));    
    System.out.println("After deleting element from index 4: " + list);

    list.insertAfterSecondOccurrence(30, 7);
    System.out.println("After inserting 30 after the second occurence of 7: " + list);
    System.out.println("***********************************************************************\n");
	}
}