import java.util.ArrayList;
import java.util.Scanner;
public class DragonDriverAL {
	public static void main(String[] args){
		ArrayList<Dragon> Dargones = new ArrayList<Dragon>();
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		System.out.println("Yo my brother(or sister) i would please like you to TYPE HOW MANY DARGONES YOU WANT!!!!!!!!!!");
		int j = scnr.nextInt();
		for(i=0;i<j;i++){
			Dargones.add(new Dragon());
			System.out.println("Print the attributes desired for dragon: wings, color, health, type, age.");
			System.out.println("In that order plz.");
			int w = scnr.nextInt();
			String c = scnr.next();
			int h = scnr.nextInt();
			String t = scnr.next();
			int a = scnr.nextInt();
			Dargones.add(new Dragon(w, c, t, h, a));
			
			System.out.println("Dragon " + (i+1) + " has these atributes: ");
			System.out.println("Wings: " + w);
			System.out.println("Color: " + c);
			System.out.println("Health: " + h);
			System.out.println("Type: " + t);
			System.out.println("Age: " + a);
			
		}
	}

}
