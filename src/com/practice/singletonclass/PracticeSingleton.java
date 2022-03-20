package com.practice.singletonclass;


class Singleton{
	private static Singleton singleton = null;
	private Singleton() {
		System.out.println("Singleton instance will be returned");
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}


public class PracticeSingleton {
	public static void main(String args[]) {
		 
	}
}
