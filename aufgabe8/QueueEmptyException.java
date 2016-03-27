package aufgabe8;

public class QueueEmptyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String message="Queue leer";
	public QueueEmptyException() {
        super(message);
    }
}