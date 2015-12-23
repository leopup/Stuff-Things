
public class Student extends Person{
	private double GPA;
	private int ID;
	private String schoolName;
	private static int studentNum = 0;
	
	public Student(){
		super();
		GPA = 0;
		ID = 0;
		schoolName = "No School";
	}
	public Student(double gepa, String sName, String pnm, int pag, double pwt){
		super(pnm, pag, pwt);
		GPA = gepa;
		setIDNum();
		schoolName = sName;
	}
	public void setIDNum(){
		studentNum++;
		ID = studentNum;
		return;
	}
	public double getGpa(){
		return GPA;
	}
	public int getId(){
		return ID;
	}
	public String getSchoolN(){
		return schoolName;
	}
	public String toString(){
		return "GPA: " + GPA + "ID: " + ID + "School Name: " + schoolName;
	}
}
