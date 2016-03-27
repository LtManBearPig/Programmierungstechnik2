package aufgabe7;

public class Student extends Person{
	
	int matrnr;
	String studiengang;
	
	public Student(String name, String Vorname, int matrnr, String studiengang) {
		super(name, Vorname);
		this.matrnr=matrnr;
		this.studiengang=studiengang;
		// TODO Auto-generated constructor stub
	}
	public String daten(){
		return String.format("%s, %s 	Matr. %d %s", this.name,this.vorname, this.matrnr, this.studiengang);
		
	}
	
}
