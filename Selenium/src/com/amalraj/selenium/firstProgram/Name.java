package com.amalraj.selenium.firstProgram;

public class Name {

}

//Interface A
interface A {
 void methodA();
}

//Interface B
interface B {
 void methodB();
}

//Class that implements both interfaces
class C implements A, B {
 // Implementing method from Interface A
 public void methodA() {
     System.out.println("Method A from Interface A");
 }

 // Implementing method from Interface B
 public void methodB() {
     System.out.println("Method B from Interface B");
 }
}

public class MultipleInheritanceDemo {
 public static void main(String[] args) {
     // Creating an object of class C
     C obj = new C();

     // Calling methods from both interfaces
     obj.methodA(); // Output: Method A from Interface A
     obj.methodB(); // Output: Method B from Interface B
 }
}
