package aufgabe8;

public class Programm {
	public static void main(String[] args) {
		Queue myqueue = new Queue();

		try {
			myqueue.enqueue(4);
			myqueue.enqueue(7);
			myqueue.enqueue(3);
			myqueue.print();
			// 4 7 3
			System.out.println(myqueue.dequeue() + " entnommen");
			// 4 entnommen
			myqueue.enqueue(8);
			myqueue.enqueue(2);
			myqueue.print();
			// 7 3 8 2
			myqueue.clear();
			System.out.println(myqueue.dequeue() + " entnommen");
			// FEHLER: Queue leer
		} catch (QueueEmptyException e) {
			System.out.println("FEHLER: " + e.getMessage());
		}
		Stack mystack = new Stack();
		try {
			mystack.push(7);
			mystack.push(3);
			mystack.print();
			// 7 3
			System.out.println(mystack.pop() + " entnommen");
			// 3 entnommen
			mystack.push(8);
			mystack.push(4);
			mystack.print();
			// 7 8 4
			System.out.println(mystack.pop() + " entnommen");
			// 4 entnommen
			System.out.println(mystack.pop() + " entnommen");
			// 8 entnommen
			System.out.println(mystack.pop() + " entnommen");
			// 7 entnommen
			System.out.println(mystack.pop() + " entnommen");
			// FEHLER: Stack leer
		} catch (StackEmptyException e) {
			System.out.println("FEHLER: " + e.getMessage());
		}
	}
}