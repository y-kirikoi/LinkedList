package demo2;

public class ListTest {

	public static void main(String[] args) {
		
		LinkedList chekLinkedList = new LinkedList();
		chekLinkedList.add(100);
		chekLinkedList.add(200);
		chekLinkedList.add(300);

		System.out.println(chekLinkedList.size()+"\n"); // it must show list size 0
		
		System.out.println(chekLinkedList.get(1));
		System.out.println(chekLinkedList.get(2));
		System.out.println(chekLinkedList.get(3)+"\n");
		
		System.out.println(chekLinkedList.get(133)+"\n");
		
		System.out.println(chekLinkedList.size()+"\n"); // it must show list size 3
		
		System.out.println(chekLinkedList.delete(2)+"\n");
		
		System.out.println(chekLinkedList.get(1));
		System.out.println(chekLinkedList.get(2));
		System.out.println(chekLinkedList.get(3)+"\n"); 
		
		System.out.println(chekLinkedList.size()); // it must show list size 2
		
	}

}
