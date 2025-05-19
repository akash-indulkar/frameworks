package com.akash;

public class MainApp {
	public static void main(String[] args) {
		Connectivity con = MyConnectionFactory.getObject(); //abstraction is provided
		con.connect();
	}
}
