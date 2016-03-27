package aufgabe5;

import java.util.Date;
import java.util.Scanner;

public class Familien {
	class Person {
		String name;
		String vorname;
		int alter;
	}

	private Person[][] familien;

	@SuppressWarnings("deprecation")
	private int alter(String geburtsDatum) {
		String[] daten = geburtsDatum.split("\\.");
		int tag = Integer.parseInt(daten[0]);
		int monat = Integer.parseInt(daten[1]);
		int jahr =Integer.parseInt(daten[2]);
		Date datum=new Date(System.currentTimeMillis());
		if(monat<(datum.getMonth()+1) | ((monat==datum.getMonth()+1) && tag<=datum.getDate())){
			return (datum.getYear()+1900)-jahr;
		}
		return (datum.getYear()+1900-jahr-1);
	}

	public void eingabeFamilien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Anzahl Familien:");
		int anzahl = Integer.parseInt(sc.nextLine());
		familien = new Person[anzahl][];
		for (int i = 0; i < anzahl; i++) {
			System.out.println("Anzahl Familienmitglieder für " + (i + 1) + ". Familie:");
			int mitglieder = Integer.parseInt(sc.nextLine());
			System.out.println("Familienname:");
			String name = sc.nextLine();

			this.familien[i] = new Person[mitglieder];

			for (int k = 0; k < mitglieder; k++) {
				System.out.println(k + ". Vorname:");
				String vorname = sc.nextLine();
				System.out.println(k + ". Geburtstag:");
				String geburtstag = sc.nextLine();
				this.familien[i][k] = new Person();
				this.familien[i][k].alter = this.alter(geburtstag);
				this.familien[i][k].name = name;
				this.familien[i][k].vorname = vorname;
			}
		}
		sc.close();
	}

	public void ausgabeFamilien() {
		for (int i = 0; i < this.familien.length; i++) {
			int alter=0;
			int count=0;
			for (int j = 0; j < this.familien[i].length; j++) {
				Person member = familien[i][j];
				System.out.println(member.vorname + " " + member.name + ", " + member.alter + " Jahre");
				alter=alter+member.alter;
				count++;
			}
			System.out.println("Durchschnittsalter: "+(float)(alter/count));
		}
	}
}