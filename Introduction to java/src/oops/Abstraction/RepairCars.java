package oops.Abstraction;

public class RepairCars {
               public static void RepairCar(Car Car) {
            	   System.out.println("Car is repaired");
               }
               public static void main(String[] args) {
            	   WagonR wagonr = new WagonR();
            	   Audi audi = new Audi();
            	   RepairCar(wagonr);
            	   RepairCar(audi);
            	   
               }
}