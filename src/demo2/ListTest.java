package demo2;

public class ListTest {

	public static void main(String[] args) {
		
		LinkedList nodeLinkedList = new LinkedList();
		nodeLinkedList.add(100);
		nodeLinkedList.add(200);
		nodeLinkedList.add(300);

		System.out.println(nodeLinkedList.get(1));
		System.out.println(nodeLinkedList.get(2));
		System.out.println(nodeLinkedList.get(3)+"\n");
		
		System.out.println(nodeLinkedList.size()+"\n");
		
		System.out.println(nodeLinkedList.delete(2)+"\n");
		
		System.out.println(nodeLinkedList.get(1));
		System.out.println(nodeLinkedList.get(2));
		System.out.println(nodeLinkedList.get(3)+"\n");
		
		System.out.println(nodeLinkedList.size());
		
	}

}
