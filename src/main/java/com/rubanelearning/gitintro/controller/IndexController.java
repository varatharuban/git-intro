package com.rubanelearning.gitintro.controller;

import com.rubanelearning.gitintro.util.Constants;

public class IndexController {

	public void sayHi(String name) {
		if(name.equals(Constants.NAME_NILA)) {
			System.out.println("Hi Dr. " + name);
			return;
		}
		System.out.println("Hi " + name);
	}
	
	// Sabir
	public void sayHello(String name) {
		System.out.println("Hi " + name);	
	}
}
