package Tweeter_Clone;

import java.util.Scanner;

public class Util {

	static Scanner sc=new Scanner(System.in);
	
	public static String getStringValue(String message) {
		System.out.println(message);
		String value=sc.nextLine();
		return value;
	}
	
	public static int getIntegerValue(String message) {
		System.out.println(message);
		int value = sc.nextInt();sc.nextLine();
		return value;
	}
	
	public static String anaMenu(String message) {
		System.out.println(message);
		return sc.nextLine();
	}
	
}
