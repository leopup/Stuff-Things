
import java.util.Scanner;
public class DragonArrayDriver {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		System.out.println("Yo my brother(or sister) i would please like you to TYPE HOW MANY DARGONES YOU WANT!!!!!!!!!!");
		int j = scnr.nextInt();
		Dragon[] dargon = new Dragon[j];
		for(i=0;i<j;i++){
			dargon[i] = new Dragon();
			System.out.println("Yo would you mind just printing the atributes wings, color, health, type, age.");
			System.out.println("In that order please.");
			int w = scnr.nextInt();
			String c = scnr.next();
			int h = scnr.nextInt();
			String t = scnr.next();
			int a = scnr.nextInt();
			
			dargon[i].setNumWings(w);
			dargon[i].setColor(c);
			dargon[i].setHealth(h);
			dargon[i].setType(t);
			dargon[i].setAge(a);
			
			System.out.println("Dragon " + (i+1) + " has these atributes: ");
			System.out.println("Wings: " + w);
			System.out.println("Color: " + c);
			System.out.println("Health: " + h);
			System.out.println("Type: " + t);
			System.out.println("Age: " + a);
		}
	}
}
