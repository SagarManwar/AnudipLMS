package Assigments;

//Parent class Person
class Person {
 protected String name;
 private int age;

 public Person(String name, int age) {
     this.name = name;
     this.setAge(age);
 }

 public void speak() {
     System.out.println(name + " says hello!");
 }

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}

//Child class studente122
class studente122 extends Person {
 private int grade;

 public studente122(String name, int age, int grade) {
     super(name, age);
     this.grade = grade;
 }

 public void study() {
     System.out.println(name + " is studying hard for grade " + grade + ".");
 }
}

public class InheritanceAssignment2 {
 public static void main(String[] args) {
     // Create an object of the studente122 class
     studente122 student1 = new studente122("Alice", 18, 12);

     // Call the "speak" method of the studente122 object
     student1.speak();

     // Call the "study" method of the studente122 object
     student1.study();
 }
}

