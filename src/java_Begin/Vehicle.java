package java_Begin;

public class Vehicle {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Ferrari","SF90",2022);
		Car car2 = new Car("Ducati","SuperSport",2024);
		System.out.println(car1.model);
		System.out.println(car2.model);
	
		car2.drive();
	}
	
}
