package aufgabe7;

import java.util.Arrays;

public class Programm {
	public static void main(String[] args) {
		Person[] hochschulmitglied = new Person[5];
		hochschulmitglied[0] = new Student("Lehmann", "Anna", 3344, "MINF");
		hochschulmitglied[1] = new Student("Müller", "Björn", 2233, "BINF");
		hochschulmitglied[2] = new Professor("Lehmann", "Bert", "Datenbanken", 456593);
		hochschulmitglied[3] = new Professor("Arndt", "Susanne", "Netze", 456587);
		hochschulmitglied[4] = new Student("Meier", "Lars", 1122, "BMIBT");
		Arrays.sort(hochschulmitglied);
		for (Person p : hochschulmitglied)
			System.out.println(p.daten());
	}
}