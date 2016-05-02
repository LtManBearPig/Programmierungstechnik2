package aufgabe7;

public abstract class Person implements Comparable<Person>{
	protected String name;
	protected String vorname;
	
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
