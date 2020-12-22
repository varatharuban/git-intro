package com.rubanelearning.gitintro.controller;

public class IndexController {

	public void sayHi(String name) {
		if(name.equals("Nila")) {
			System.out.println("Hi Dr. " + name);
			return;
		}
		System.out.println("Hi " + name);
	}
}