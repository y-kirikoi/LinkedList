package demo2;

public class ListTest {

	public static void main(String[] args) {
		

		LinkedList chekLinkedList = new LinkedList();
		
		chekLinkedList.add(28);
		chekLinkedList.add(16);
		chekLinkedList.add(15);
		chekLinkedList.add(113);

		chekLinkedList.delete(2); //it's deleting one element
		
		System.out.println(chekLinkedList.get(1));
		System.out.println(chekLinkedList.get(2));
		System.out.println(chekLinkedList.get(3));
		System.out.println(chekLinkedList.get(4)+"\n"); //it'll be null after deleting one of elems
		System.out.println(chekLinkedList.size()); // it must show list size 3
		
	}

}
