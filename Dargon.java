
public class Dargon {
	private int size = 0;
	private String color = "";
	private String name = "";
	private int power = 1;
	private boolean gender = false;
	private String sex = "";
	
	public Dargon(){
		
	}
	public Dargon(int sz, String clr, String nm, int pwr, boolean gndr){
		if(sz > 10){
			sz = 10;
			System.out.println("Sorry buddy but 10's the limit.");
		}
		size = sz;
		color = clr;
		name = nm;
		power = pwr;
		gender = gndr;
		if(gender = true){
			sex = "Male";
		}
		else{
			sex = "Female";
		}
		
		System.out.println(">Dragon Drawing<"); //Trust me its there...
		System.out.println("Dragon Stats:");
		System.out.println(name + "The " + color + " Dragon");
		System.out.println(sex + "");
		System.out.println("Power :" + power);
	}
	public void DragonTrain(int timeH){
		int timePutIn = 0;
		timePutIn = timePutIn + timeH;
		int powerAdd = timePutIn/10;
		power = power + powerAdd;
	}

}
