package p1;

public class MyLinkedList {

	Node start;

	public void add(int data) {
		Node temp = new Node(data);

		if (start == null) {

			start = temp;
		} else {
			Node itr = start;
			while (itr.next != null) {
				itr = itr.next;
			}

			itr.next = temp;
		}
		System.out.println("Data Added");

	}

	public void addFirst(int data) {
		// TODO Auto-generated method stub

		Node temp = new Node(data);

		temp.next = start;
		start = temp;
		System.out.println("Data Added");

	}

	public void display() {
		// TODO Auto-generated method stub

		if (start == null) {
			System.out.println("List is Empty");

		} else {
			Node itr = start;

			while (itr.next != null) {

				System.out.print(itr.getData() + " -> ");
				itr = itr.next;

			}
			System.out.print(itr.getData() + " -> Null\n"); // for printing last element
		}
	}

	public void addPosition(int data) {
		// TODO Auto-generated method stub

	}

	public void addLast(int data) {
		// TODO Auto-generated method stub

		Node temp = new Node(data);

		if (start == null) {

			start = temp;
		} else {
			Node itr = start;
			while (itr.next != null) {
				itr = itr.next;
			}

			itr.next = temp;
		}
		System.out.println("Data Added");

	}

	
}
