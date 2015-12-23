
public class Person {
	private String pName;
	private int pAge;
	private double pWeight;
	
	public Person(){
		pName = "Unknown";
		pAge = 0;
		pWeight = 0;
	}
	public Person(String pnm, int pag, double pwt){
		pName = pnm;
		pAge = pag;
		pWeight = pwt;
	}
	public String getName(){
		return pName;
	}
	public int getAge(){
		return pAge;
	}
	public double getWeight(){
		return pWeight;
	}
	public String toString(){
		return "Name: " + pName + "Age: " + pAge + "Weight: " + pWeight;
	}
}
