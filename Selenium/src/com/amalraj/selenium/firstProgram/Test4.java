package com.amalraj.selenium.firstProgram;

public class Test4 {
	private String name;
    private int age;
    
    
    public static void main(String[] args) {
    	Test4 obj = new Test4();
    	obj.setName("Amal");
    	obj.setAge(28);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
}
