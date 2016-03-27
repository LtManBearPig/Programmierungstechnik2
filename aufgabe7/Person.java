package aufgabe7;

public class Person implements Comparable<Person>{
	String name;
	String vorname;
	
	public Person(String name, String vorname){
		this.name=name;
		this.vorname=vorname;
	}
	
	public String daten(){
		return name+" "+vorname;
		
	}

	@Override
	public int compareTo(Person p) {
			if (this.name.compareTo(p.name)==0){
				return this.vorname.compareTo(p.vorname);
			}
		return this.name.compareTo(p.name);
			
	}
}
