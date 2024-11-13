package com.amalraj.selenium.firstProgram;

public class Test2 {
	
	public void display(int value1, String value2, float value3) {
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }

	
	public static void main(String[] args) {
		
		int value1=10;
		String value2="Hai";
		float value3=20.5f;	
		Test2 obj = new Test2();
		obj.display(value1, value2, value3);
		
		
	}
}
