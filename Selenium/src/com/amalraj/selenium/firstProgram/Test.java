package com.amalraj.selenium.firstProgram;

public class Test {
	static String value1 = "Hi world";
	String value2;
	
	
	
	public Test(String value2) {
		
		this.value2= value2;
		
	}
	
	
	
	public void display() {
       
        String value3 = "local";

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
	
	
	  public static void main(String[] args) {
	        
	        Test obj = new Test("Test");
	        obj.display();
	    }

}
