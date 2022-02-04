package Familj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Son extends Father implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6616176418480205361L;

	double salary;
	String lastname;

	public Son(String name, int age, double salary, String lastname) {
		super(name , age );
		this.salary = salary;
		this.lastname = lastname;
	}

	public static Son creat_object(Scanner input) {
		Son s;
		System.out.println("enter your name ");
		String name = input.next();
		System.out.println("enter your ");
		int age = input.nextInt();
		System.out.println("enter your salary");
		double salary = input.nextDouble();
		System.out.println("enter your lastname ");
		String lastname = input.next();
		s = new Son(name, age, salary, lastname);
		return s;
	}

	public void writeObject(ObjectOutputStream x) throws IOException {
		x.defaultWriteObject();

		x.writeObject(getName());
		x.writeInt(age);
		;

	}

	public void readObject(ObjectInputStream y) throws ClassNotFoundException, IOException {
		y.defaultReadObject();

		setName((String) y.readObject());
		setAge(y.readInt());
	}

	public static void serializable(Son s, Scanner input) throws IOException {
		File f = new File("/Users/Ali Al-Doori/Desktop", "Leia Ali Aldoori");
		FileOutputStream x = new FileOutputStream(f);
		ObjectOutputStream y = new ObjectOutputStream(x);

		y.writeObject(s.creat_object(input));
		System.out.println("object is serialized");
		
		y.close();
		x.close();
		

	}
	public static void deserializable (  File f  ) throws IOException, ClassNotFoundException {
		FileInputStream x = new FileInputStream ( f) ;
		ObjectInputStream z = new ObjectInputStream (x) ;
		 
		Son s = (Son) z.readObject() ;
		System.out.println(s.toString());
		z.close();
		x.close();
		
	}

	@Override
	public String toString() {
		return "Son [salary=" + salary + ", lastname=" + lastname + ", name=" + name + ", age=" + age + "]";
	}

}
