package aufgabe3;

public class Bruch {
	int zaehler;
	int nenner;

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;

	}

	public Bruch() {

	}

	public static int vergleich(Bruch a, Bruch b) {
		int azaehler = a.zaehler * b.nenner;
		int bzaehler = b.zaehler * a.nenner;
		if (azaehler > bzaehler) {
			return 1;
		}
		if (azaehler < bzaehler) {
			return -1;
		}

		return 0;
	}

	public static Bruch add(Bruch a, Bruch b) {
		int azaehler = a.zaehler * b.nenner;
		int bzaehler = b.zaehler * a.nenner;
		int nenner = a.nenner * b.nenner;
		return new Bruch((azaehler + bzaehler), nenner);
	}

	public Bruch add(Bruch b) {
		int azaehler = this.zaehler * b.nenner;
		int bzaehler = b.zaehler * this.nenner;
		int nenner = this.nenner * b.nenner;
		this.zaehler = azaehler + bzaehler;
		this.nenner = nenner;

		return this;

	}

	public Bruch kürze() {
		boolean change = true;
		while (change) {
			change = false;

			int check;
			if (this.zaehler > this.nenner) {
				check = this.nenner;
			} else {
				check = this.zaehler;
			}

			for (int i = check; i > 1; i--) {
				if ((this.zaehler % i == 0) && (this.nenner % i == 0)) {
					this.zaehler = this.zaehler / i;
					this.nenner = this.nenner / i;
					change = true;
				}

			}
		}
		return this;
	}

	public void print() {
		System.out.println(this.zaehler + "/" + this.nenner);

	}
}