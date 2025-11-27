package java_Begin;

public class Car {

	String name;
	String model;
	int year;
	
	Car(String name, String model, int year){
		this.name=name;
		this.model=model;
		this.year=year;
	}
	void drive() {
		System.out.println(this.name+" goes Zooom");
	}
	void stop() {
		System.out.println(this.name+" ushhh..");
	}
}
