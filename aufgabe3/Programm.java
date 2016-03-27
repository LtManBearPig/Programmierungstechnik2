package aufgabe3;

public class Programm {
	public static void main(String[] args) {
		Bruch b1 = new Bruch(2, 3);
		Bruch b2 = new Bruch(1, 4);
		Bruch b3 = new Bruch();
		if (Bruch.vergleich(b1, b2) == 1)
			System.out.println("b1 > b2");
		// b1 > b2
		if (Bruch.vergleich(b1, b2) == 0)
			System.out.println("b1 = b2");
		if (Bruch.vergleich(b1, b2) == -1)
			System.out.println("b1 < b2");
		b1.add(b2);
		b1.print();
		// 11/12
		b2.print();
		// 1/4
		b3 = Bruch.add(b1, b2);
		b1.print();
		// 11/12
		b2.print();
		// 1/4
		b3.print();
		// 56/48
		b3.kürze();
		b1.print();
		// 11/12
		b2.print();
		// 1/4
		b3.print();
		// 7/6
		b2 = b1.add(b2).kürze();
		b1.print();
		// 7/6
		b2.print();
		// 7/6
		b3.print();
		// 7/6
	}
}