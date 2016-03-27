package aufgabe8;

public class Stack extends List {
	public void push(int value) {
		super.append(value);
	}

	public int pop() throws StackEmptyException {
		if(super.end==null){
			throw new StackEmptyException();
		}
		
		int ret = super.end.value;
		if(super.end.prae != null){
			super.end = super.end.prae;
			super.end.next = null;
		} else {
			super.begin=null;
			super.end=null;
		}
		
		return ret;
	}
}
