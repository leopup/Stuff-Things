import java.util.Scanner;
public class DargonDriver {
	Scanner scnr = new Scanner(System.in);
	System.out.println("Type in the desired size, color, name, and gender.");
	System.out.println("In that order or i'll make you regret it <3");
	int desiredSize = scnr.nextInt();
	String desiredColor = scnr.nextLine();
	String desiredName = scnr.nextLine();
	System.out.println("oh and if you want to be a boy say true and if a gurl say false...");
	boolean desiredGender = scnr.nextBoolean();
	
}
