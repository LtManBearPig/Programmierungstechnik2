package Aufgabe2;

public class Programm {
	public static void main(String[] args) {
		List list = new List();
		list.append(3);
		list.append(8);
		list.append(3);
		list.append(2);
		list.print();
		// 3 8 3 2
		while (list.delete(3));
		list.print();
		// 8 2
		list.append(4);
		list.append(5);
		list.print();
		// 8 2 4 5
	}
}