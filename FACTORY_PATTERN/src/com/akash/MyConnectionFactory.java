package com.akash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class MyConnectionFactory { //actual factory class which is responsible for providing object at runtime
	public static Connectivity getObject() {
		try {
			FileInputStream FIS = new FileInputStream("./src/com/akash/ConnectionType.txt");
			Scanner sc = new Scanner(FIS);
			String connectionType = sc.nextLine();
			Connectivity con = (Connectivity)Class.forName(connectionType).getConstructor().newInstance();
			return con;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | FileNotFoundException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}
