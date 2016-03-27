package aufgabe8;

public class List {
	Element begin;
	Element end;

	public void append(int value) {
		if (this.begin == null) {
			this.begin = new Element();
			this.begin.prae = null;
			this.begin.value = value;
			this.end = begin;
		} else {
			this.end.next = new Element();
			this.end.next.prae = end;
			this.end = end.next;
			this.end.value = value;
		}
	}

	public void clear() {
		this.begin = null;
		this.end = null;
	}

	public void print() {
		Element search = this.begin;
		while (search != null) {
			System.out.print(search.value + " ");
			search = search.next;
		}
		System.out.println("");
	}
}
