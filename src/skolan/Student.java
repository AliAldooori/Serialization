package skolan;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -645692059542180012L;

	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void printStudent() {
		System.out.println("welcome " + name);
	}
	
	public Student create_object (Scanner input) {
		
	Student s ;
	System.out.println("enter your name ");
	String name = input.next();
	System.out.println("enter your age");
	int age = input.nextInt();
	s= new Student(name, age);
		return s ;
	}
	
	
	
	
	
	
}
