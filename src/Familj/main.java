package Familj;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	 
		Scanner input = new Scanner (System.in);
		File f = new File("/Users/Ali Al-Doori/Desktop", "Leia Ali Aldoori");
	Son a =	Son.creat_object( input) ;
		
		System.out.println(a.toString());
		
		Son.serializable(a, input);
		Son.deserializable( f);
	}

}
