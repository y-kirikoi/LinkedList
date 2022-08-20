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
		LinkedList currentElem1 = this;
		LinkedList currentElem2 = this.next;
			for(int i = index; i >= 1;) {
				currentElem1 = currentElem1.next;
				currentElem2 = currentElem2.next;
				if(i == 1) {
					currentElem1.next = currentElem2.next;
					return true;
				}
				return false;
			}
            return false;
	}
	/*===============
	public int size() {
                //PUT YOUR CODE HERE
                //PUT YOUR CODE HERE
	}================*/
}   
     








/*

public class LinkedListRecurrent {

  private Integer data;
  private LinkedListRecurrent next;

  public LinkedListRecurrent() {
  }

  public LinkedListRecurrent(Integer data) {
    this.data = data;
  }
  
  public void setNext(LinkedListRecurrent next){
    this.next = next;
  }

  public boolean isntLast(){
    return next != null;
  }
  
  public void add(Integer data) {
    if (isntLast()){
      next.add(data);
    } else {
      setNext(new LinkedListRecurrent(data));
    }
  }
}

*/