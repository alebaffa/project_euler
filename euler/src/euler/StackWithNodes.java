package euler;

public class StackWithNodes {

	// LIFO algorithm
	public class Node {
		String value;
		Node next;
	}

	Node first;
	int size = 1;

	public void push(String value) {
		Node oldfirst = first;
		first = new Node();
		first.value = value;
		first.next = oldfirst;
		size++;
	}

	public String pop() {
		String value = first.value;
		first = first.next;
		size--;
		return value;
	}

	public void removeFromStack(String value) {
		Node n = first;
		if(n.value == value){
			first = n.next;
		}
		while (n.next != null) {
			if (n.next.value == value) {
				n.next = n.next.next;
			}
			n = n.next;
		}
	}

}
