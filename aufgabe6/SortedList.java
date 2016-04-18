package aufgabe6;

public class SortedList extends List {

	public boolean append(int i) {
		if (this.anker == null) {
			this.anker = new Element();
			this.anker.value = i;
			this.anker.next = null;
		} else {
			if (i < anker.value) {
				Element zwischen = new Element();
				zwischen.value = i;
				zwischen.next = anker;
				anker = zwischen;
				return true;
			}
			Element search = this.anker;
			while (search.next != null) {
				if (search.next.value > i) {
					Element zwischen = new Element();
					zwischen.value = i;
					zwischen.next = search.next;
					search.next = zwischen;
					return true;
				} else {
					search = search.next;
				}
			}
				search.next = new Element();
				search.next.value = i;
				search.next.next = null;
			return true;
		}
		return false;
	}
}

