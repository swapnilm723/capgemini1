/**
 * @version: 2.1
 * @author Swapnil
 *
 */
public class Person {
	 private String First_name;
	 private String Last_name;
	 private String Gender;
	 private int Age;
	 private double Weight;
	 

	public Person(String First_name,String Last_name,String Gender,int Age, double Weight) {
		// TODO Auto-generated constructor stub
		this.First_name=First_name;
		this.Last_name=Last_name;
		this.Gender=Gender;
		this.Age=Age;
		this.Weight=Weight;
		
	}

	public void display() {
	System.out.println("First_name : " + First_name);
	System.out.println("Last_name : " + Last_name);
	System.out.println("Gender : " + Gender);
	System.out.println("Age : " + Age);
	System.out.println("Weight : " + Weight);
	
	
	
	}
    public static void main(String[] args) {
			Person p = new Person("Divya","Bharati","F",30,85);
			p.display();

	}

}
