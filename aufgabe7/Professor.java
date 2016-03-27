package aufgabe7;

public class Professor extends Person{
	
	String gebiet;
	int tel;
	
	public Professor(String name, String vorname, String gebiet, int tel){
		super(name,vorname);
		this.gebiet=gebiet;
		this.tel=tel;
		
	}
	
	public String daten(){
		return String.format("%s, %s 	Gebiet: %s, Tel. %d", this.name,this.vorname, this.gebiet, this.tel);
		
	}
}
