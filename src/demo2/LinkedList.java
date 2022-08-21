package demo2;

public class LinkedList {
	
	public Integer data;
	public LinkedList next;
	
	
	public LinkedList() {

	}
	
	
	public boolean isLast() {
		return next == null;
	}
	public void setNext(LinkedList newNext) {
		if (!isLast()) {
			System.out.println("Warning! Not null next is changed!");
		}
		next = newNext;
	}
	public void setData(Integer newData) {
		data = newData;
	}
	public LinkedList getNext() {
		return next;
	}
		

	
	public void add(Integer data) {

		LinkedList newElem = new LinkedList();
		newElem.setData(data);
		
		LinkedList lastElem = this;
		while (!lastElem.isLast()) {
			lastElem = lastElem.getNext();
		}
		lastElem.setNext(newElem);
	}
	

	public Integer get(int index) {

		if(0 != index) {
			if(next!=null) {
				return next.get(index-1);
			}
				return null;
		} else {
			return this.data;
		}
			
	}   

	public boolean delete(int index) {
		
		LinkedList currentElem = this;
		
		for(int i = index; i > 1; i--) {
			currentElem = currentElem.next;
				if(i == 1) {
					this.next = this.next.next;
					return true;
				} 
		}
		return false;
	}

	public int size() {
		LinkedList countElem = this;
		int counter = 0;
			while(countElem.next != null) {
				countElem = countElem.next;
				counter++;
			}

           return counter;
	}
}
