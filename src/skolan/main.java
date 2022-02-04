package skolan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args) throws IOException {
	Student s1 = new Student("ali",37) ;
	Student s2 = new Student("anas",43) ;
	
	File f = new File ("/Users/Ali Al-Doori/Desktop","Dalia") ;
	
	System.out.println(f.createNewFile());
			
	FileOutputStream x = new FileOutputStream(f);
	ObjectOutputStream y = new ObjectOutputStream(x) ;
	y.writeObject(s1) ;
	y.writeObject(s2) ;
	
	System.out.println("the object is serialized");
	
	FileInputStream k = new FileInputStream(f);
	ObjectInputStream j = new ObjectInputStream(k) ;
	j.close();
	k.close();
     y.close();
     x.close();
     
	}

}
