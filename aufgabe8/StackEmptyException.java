package aufgabe8;

public class StackEmptyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String message="Stack leer";
	public StackEmptyException(){
		super(message);
	}
}