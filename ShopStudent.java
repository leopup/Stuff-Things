
public class ShopStudent extends Student{
	private Uniform shopUniform;
	private String shopName;
	private String academy;
	
	public ShopStudent(){
		shopUniform = new Uniform();
		shopName = "";
		academy = "";
	}
	public ShopStudent(String sc, String pc, String st, boolean jwl, String sn, String an, double gepa, String sName, String pnm, int pag, double pwt){
		super(gepa, sName, pnm, pag, pwt);
		shopUniform = new Uniform(sc, pc, st, jwl);
		shopName = sn;
		academy = an;
	}
	public void setUniform(String sc, String pc, String st, boolean jwl){
		shopUniform = new Uniform(sc, pc, st, jwl);
		return;
	}
	public void setShopName(String sn){
		shopName = sn;
		return;
	}
	public void setAcademy(String an){
		academy = an;
		return;
	}
	public Uniform getUniform(){
		return shopUniform;
	}
	public String getShopName(){
		return shopName;
	}
	public String getAcademy(){
		return academy;
	}
	public String toString(){
		return "Uniform: " + shopUniform + "Shop Name: " + shopName + "Academy: " + academy;
	}
}
