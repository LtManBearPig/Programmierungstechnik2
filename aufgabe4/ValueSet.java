package aufgabe4;

public class ValueSet<T> {
	private int count;
	private Object[] values = new Object[100];
	
	

	public ValueSet(T... valuesnew){
		this.count=0;
		this.addValues(valuesnew);
	}
	
	private boolean addValue(T value) {
		for (int i = 0; i < count; i++) {
			if (this.values[i].equals(value)){
				return false;
			}
		}
		this.values[count] = value;
		this.count++;
		return true;
	}

	private void addValues(T... values){ 
	 
		for (T value : values) 
			this.addValue(value); 
	}
	
	public void printValues(){
		for(int i=0; i<this.count;i++){
			System.out.print(this.values[i]+" ");
		}
		System.out.println("");
	}
	
	public static ValueSet union(ValueSet vs1, ValueSet vs2){
		ValueSet vs3=new ValueSet();
		for(int i=0;i<vs1.count;i++){
			vs3.addValue(vs1.values[i]);
		}
		for(int i=0;i<vs2.count;i++){
			vs3.addValue(vs2.values[i]);
		}
		
		return vs3;
	}
	
	public static ValueSet intersect(ValueSet vs1, ValueSet vs2){
		ValueSet vs3=new ValueSet();
		for (int i = 0; i < vs1.count; i++) {
			for (int k=0; k<vs2.count;k++){
				if (vs1.values[i] == vs2.values[k]){
					vs3.addValue(vs1.values[i]);
				}
			}
		}
		return vs3;
	}
}