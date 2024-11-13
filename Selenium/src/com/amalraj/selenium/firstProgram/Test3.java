package com.amalraj.selenium.firstProgram;

public class Test3 {
	int value1;
	int value2;
	
	
	public Test3(int value1,int value2) {
		this.value1=value1;
		this.value2=value2;
		
		
	}
	
	
	 public void display() {
	        System.out.println(value1);
	        System.out.println(value2);
	    }
	 
	 
	 public static void main(String[] args) {
		 
		 Test3 test = new Test3(10,20);
	        test.display();
		 
		 
	 }

}
