package aufgabe9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Programm {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Java\\Programierungstechnik2\\Aufgabe2\\Aufgaben\\bin\\aufgabe9\\Objekte.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Object o= ois.readObject();
		
		System.out.println("KLASSE");
		System.out.println("  "+o.getClass().getName());
		
		System.out.println("FELDER");
		Field[] fields=o.getClass().getFields();
		for(int i=0; i<fields.length;i++){
			System.out.println("  "+fields[i].getName());
		}
		
		System.out.println("KONSTRUKTOREN");
		Constructor<?>[] constructs=o.getClass().getConstructors();
		for(int i=0; i<constructs.length;i++){
			System.out.println("  "+constructs[i].getName());
		}

		System.out.println("METHODEN");
		Method[] methods=o.getClass().getMethods();
		for(int i=0; i<methods.length;i++){
			System.out.println("  "+methods[i].getName());
		}
		ois.close();
		fis.close();
	}

}