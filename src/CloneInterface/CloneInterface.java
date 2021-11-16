package CloneInterface;

class Student implements Cloneable {  
	int id;  
	String name;  
	Student(int id, String name){  
		this.id = id;  
		this.name = name;  
	}  
	protected Object clone() throws CloneNotSupportedException {  
	
	return super.clone();  
	}  
}
public class CloneInterface {

	public static void main(String[] args) {
		
		Student s = new Student(418, "Aditya");  
		System.out.println(s.id + " " + s.name);  
		try {  
			Student s1 = (Student)s.clone();  
			System.out.println(s1.id + " " + s1.name);  
		}catch (Exception e) { 
			System.out.println(s.toString());  
		}  
		  

	}

}
