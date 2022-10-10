package com;

public class ConstructorOverload {
	
	ConstructorOverload(){
		System.out.println("COnstructor 1");
	}
	ConstructorOverload(int a,int b){
		System.out.println("Constructor 2");
	}
	ConstructorOverload(String a ,String b){
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload a = new ConstructorOverload();
		ConstructorOverload b = new ConstructorOverload(5,7);
		ConstructorOverload c = new ConstructorOverload("Test","Test1");
	}

}
