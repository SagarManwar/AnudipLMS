package Assigments;

//Parent class Vehicle
class Vehicle {
 protected String brand;
 protected String model;
 protected int year;

 public Vehicle(String brand, String model, int year) {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 public void drive() {
     System.out.println(year + " " + brand + " " + model + " is now driving.");
 }
}

//Child class Car
class Car extends Vehicle {
 private String color;

 public Car(String brand, String model, int year, String color) {
     super(brand, model, year);
     this.color = color;
 }

 public void honk() {
     System.out.println(year + " " + brand + " " + model + " in " + color + " goes honk honk!");
 }
}

public class InheriteceQuation1 {
 public static void main(String[] args) {
     // Create an object of the Car class
     Car myCar = new Car("Toyota", "Camry", 2023, "blue");

     // Call the "drive" method of the Car object
     myCar.drive();

     // Call the "honk" method of the Car object
     myCar.honk();
 }
}