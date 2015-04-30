package euler;

public class Queue {

	public class Node {
		String value;
		Node next;
	}

	Node last;
	Node first;
	int size;

	public boolean isEmpty() {
		return size == 0;
	}

	public void queue(String value) {
		Node oldlast = last;
		Node last = new Node();
		last.value = value;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;

	}

	public String dequeue() {
		String value = first.value;
		first = first.next;
		size--;
		if (isEmpty())
			last = null;
		return value;
	}

}
