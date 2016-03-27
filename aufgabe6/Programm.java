package aufgabe6;

public class Programm {
	public static void main(String[] args) {
		List[] list = new List[2];
		list[0] = new List();
		list[0].append(3);
		list[0].append(8);
		list[0].append(3);
		list[0].append(2);
		list[0].print();
		// 3 8 3 2
		list[1] = new SortedList();
		list[1].append(4);
		list[1].append(5);
		list[1].append(4);
		list[1].append(1);
		list[1].append(3);
		list[1].print();
		// 1 3 4 4 5
		list[1].delete(4);
		list[1].print();
		// 1 3 4 5
	}
}