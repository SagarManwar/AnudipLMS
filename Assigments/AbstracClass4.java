package Assigments;

//Define the Person interface
interface Person {
 void speak();
}

//Implement the Person interface in the student321 class
class student321 implements Person {
 private String name;

 public student321(String name) {
     this.name = name;
 }

 @Override
 public void speak() {
     System.out.println("student321 " + name + " says hello!");
 }
}

//Implement the Person interface in the teacher class
class teacher implements Person {
 private String name;

 public teacher(String name) {
     this.name = name;
 }

 @Override
 public void speak() {
     System.out.println("teacher " + name + " says welcome!");
 }
}

public class AbstracClass4 {
 public static void main(String[] args) {
     // Create an object of the student321 class
     student321 student = new student321("Alice");

     // Call the "speak" method of the student321 object
     student.speak();

     // Create an object of the teacher class
     teacher myTeacher = new teacher("Mr. Smith");

     // Call the "speak" method of the teacher object
     myTeacher.speak();
 }
}
