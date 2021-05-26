package com.controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {
	static String name;
	static String email;
    static String password;
	public void viewprofile()throws Exception{
		System.out.println(name+"  "+password+" "+email);
	}
	public void createprofile()throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		name=br.readLine();
		System.out.println("enter your email");
		email=br.readLine();
		System.out.println("enter your password");
		password=br.readLine();
}
	public void deleteprofile() throws Exception{
		name="";
		email="";
	    password="";
		System.out.println("deleted");
		
	}
	
}
