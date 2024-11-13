package com.amalraj.selenium.firstProgram;

public class NameAge implements Namee, Age{
	
		 public void namemethod() {
		     System.out.println("Amal");
		 }

		 public void agemethod() {
		     System.out.println(28);
		 }
		 
		 
		 public static void main(String[] args) {
		
			 NameAge obj = new NameAge();

		     
		     obj.namemethod(); 
		     obj.agemethod(); 
		 }
		

}
