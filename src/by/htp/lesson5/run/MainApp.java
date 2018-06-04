package by.htp.lesson5.run;

import by.htp.lesson5.entity.*;

public class MainApp {

	public static void main(String[] args) {
		B b = new B();
		System.out.println();
		
		Student st = new Student();
		System.out.println();
		
		Person persons[] = new Person[] {
			new Student(),
			new Student(),
			new Student(),
			new Employee()
		};
		System.out.println();
		for(Person p: persons) {
			System.out.println(p);
		}
		System.out.println();
	}

}
