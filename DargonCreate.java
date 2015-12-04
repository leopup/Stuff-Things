
public class DargonCreate {
	private currentDargon;
	
	public void createDargon(Dargon newD){
		currentDargon = newD;
	}
	public void write(){
		System.out.println("Current Dragon: " + currentDargon);
	}

}
