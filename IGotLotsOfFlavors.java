
public class IGotLotsOfFlavors {
	public static void main(String args[]){
		Person person1 = new Person("Leo", 16, 127.7);
		Student student1 = new Student(3.8, "Worcester Tech", "Leo", 16, 127.7);
		ShopStudent sStudent1 = new ShopStudent("Black", "Black", "Steel-Toed", false, "Electro-Mechanical", "Alden", 3.8, "Worcester Tech", "Leo", 16, 127.7);
		
		System.out.println("The person1 stats are: ");
		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());
		System.out.println("Weight: " + person1.getWeight());
		System.out.println();
		
		System.out.println("The student1 stats are: ");
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Weight: " + student1.getWeight());
		System.out.println("GPA: " + student1.getGpa());
		System.out.println("School Name: " + student1.getSchoolN());
		System.out.println("ID number: " + student1.getId());
		System.out.println();
		
		System.out.println("The shop student1 stats are: ");
		System.out.println("Name: " + sStudent1.getName());
		System.out.println("Age: " + sStudent1.getAge());
		System.out.println("Weight: " + sStudent1.getWeight());
		System.out.println("GPA: " + sStudent1.getGpa());
		System.out.println("School Name: " + sStudent1.getSchoolN());
		System.out.println("ID number: " + sStudent1.getId());
		System.out.println("Academy: " + sStudent1.getAcademy());
		System.out.println("Shop Name: " + sStudent1.getShopName());
		System.out.println("Shop Uniform:");
		System.out.println("Shirt Color: " + sStudent1.getUniform().getShirtColor());
		System.out.println("Pant Color: " + sStudent1.getUniform().getPantColor());
		System.out.println("Shoe Type Needed: " + sStudent1.getUniform().getShoeType());
		if(sStudent1.getUniform().getJewelry() == true){
			System.out.println("Jewelry is allowed.");
		}
		else{
			System.out.println("Jewelry is not allowed.");
		}
	}
}
