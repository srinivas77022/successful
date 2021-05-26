package com.Instagram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.controller.Controller;

public class Viewer {
	

	public static void main(String[] args) throws Exception {
		
		String s="y";
		while(s.equals("y")) {
		
		System.out.println("main menu");
		System.out.println("enter 1 for create profile");
		System.out.println("enter 2 for view profile");
		System.out.println("enter 3 for delete profile");
		
		System.out.println("enter any number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
		int d=Integer.parseInt(a);
		
		Controller C=new Controller();
		switch(d) {
		case 1:C.createprofile();
		break;
		case 2:C.viewprofile();
		break;
		case 3:C.deleteprofile();;
		break;
		default:System.out.println("wrong number");
		}
		System.out.println("to continue y/n");
		s=br.readLine();
		
		}
		}
		
		
		
	}


