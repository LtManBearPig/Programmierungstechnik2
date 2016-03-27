package aufgabe8;

public class Queue extends List{
	public void enqueue(int value){
		super.append(value);
	}
	
	public int dequeue() throws QueueEmptyException{
		if(super.begin==null){
			throw new QueueEmptyException();
		}
		int ret=super.begin.value;
		super.begin=super.begin.next;
		super.begin.prae=null;
		return ret;
	}

}
