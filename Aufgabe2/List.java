package Aufgabe2;

public class List {
	class Element {
		public int value;
		public Element next;
	}

	Element anker;

	public List() {
		this.anker = null;

	}

	public void append(int i) {
		if (this.anker == null) {
			this.anker = new Element();
			this.anker.value = i;
			this.anker.next = null;
		} else {
			Element search = this.anker;
			while (search.next != null) {
				search = search.next;
			}
			search.next = new Element();
			search.next.value = i;
			search.next.next = null;
		}
	}

	public boolean delete(int i) {
		Element search = this.anker;
		if (search.value == i) {
			anker=anker.next;
			return true;
		}
		while (search.next != null) {
			if (search.next.value == i) {
				search.next = search.next.next;
				return true;
			}
			search = search.next;
		}
		return false;

	}

	public void print() {
		Element search = this.anker;
		while (search != null) {
			System.out.println(search.value);
			search = search.next;
		}
	}
}