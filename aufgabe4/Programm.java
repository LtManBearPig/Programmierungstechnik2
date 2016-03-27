package aufgabe4;

public class Programm {
	public static void main(String[] args) {
		ValueSet<Integer> vs1 = new ValueSet<Integer>(1, 3, 5, 8, 9);
		vs1.printValues();
		// 1 3 5 8 9
		ValueSet<Integer> vs2 = new ValueSet<Integer>(1, 7, 9, 7);
		vs2.printValues();
		// 1 7 9
		
		
		ValueSet<Integer> vs3 = ValueSet.union(vs1, vs2);
		vs3.printValues();
		// 1 3 5 8 9 7
		
		
		ValueSet<Integer> vs4 = ValueSet.intersect(vs1, vs2);
		vs4.printValues();
		// 1 9
		
		 
	}
}