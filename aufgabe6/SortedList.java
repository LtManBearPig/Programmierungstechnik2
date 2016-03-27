package aufgabe6;

public class SortedList extends List{

	public void append(int i) {
		if (this.anker == null) {
			this.anker = new Element();
			this.anker.value = i;
			this.anker.next = null;
		} else {
			boolean changed=false;
			if(i<anker.value){
				Element zwischen=new Element();
				zwischen.value=i;
				zwischen.next=anker;
				anker=zwischen;
				changed=true;
			}
			Element search = this.anker;
			
			while (search.next != null) {
				if (search.next.value>i && changed==false){
					Element zwischen=new Element();
					zwischen.value=i;
					zwischen.next=search.next;
					search.next=zwischen;
					changed=true;
				}else{
				search = search.next;
				}
			}
			if(changed==false){
				search.next = new Element();
				search.next.value = i;
				search.next.next = null;
			}
		}
	}
}
