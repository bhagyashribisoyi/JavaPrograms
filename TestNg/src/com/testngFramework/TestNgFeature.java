package com.testngFramework;

import org.testng.annotations.Test;

public class TestNgFeature {

	@Test
	public void logintest(){
		System.out.println("login test");
		int a=10/0;
	}
	@Test(dependsOnMethods="logintest")
	public void Searchtest(){
		System.out.println("Searchtest");
	}
	@Test()
	public void Registrationpagetest(){
		System.out.println("Registrationpagetest");
	}
}
