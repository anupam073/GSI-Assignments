package Assignment6;


class Vehicle {
 String brand;
 int year;

 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }


 public void displayVehicleInfo() {
     System.out.println("Vehicle Information");
     System.out.println("-------------------");
     System.out.println("Brand : " + brand);
     System.out.println("Year  : " + year);
 }
}


class Car extends Vehicle {
 String model;


 public Car(String brand, int year, String model) {
     super(brand, year); 
     this.model = model;
 }


 @Override
 public void displayVehicleInfo() {
     super.displayVehicleInfo(); 
     
     System.out.println("\nCar Information");
     System.out.println("---------------");
     System.out.println("Model : " + model);
 }
}


public class vehicleDetails {
 public static void main(String[] args) {
  
     Car car = new Car("Toyota", 2023, "Fortuner");
     car.displayVehicleInfo();
 }
}