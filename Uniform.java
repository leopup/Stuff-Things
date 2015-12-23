
public class Uniform {
	private String shirtColor;
	private String pantColor;
	private String shoeType;
	private boolean jewelry;
	
	public Uniform(){
		shirtColor = "";
		pantColor = "";
		shoeType = "";
		jewelry = false;
	}
	public Uniform(String sc, String pc, String st, boolean jwl){
		shirtColor = sc;
		pantColor = pc;
		shoeType = st;
		jewelry = jwl;
	}
	public void setShirtColor(String sc){
		shirtColor = sc;
		return;
	}
	public void setPantColor(String pc){
		pantColor = pc;
		return;
	}
	public void setShoeType(String st){
		shoeType = st;
		return;
	}
	public void setJewelry(boolean jwl){
		jewelry = jwl;
		return;
	}
	public String getShirtColor(){
		return shirtColor;
	}
	public String getPantColor(){
		return pantColor;
	}
	public String getShoeType(){
		return shoeType;
	}
	public boolean getJewelry(){
		return jewelry;
	}
}
