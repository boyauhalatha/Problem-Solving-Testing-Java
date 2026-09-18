/*
 * TASK 3: VEHICLE RENTAL SYSTEM
 *
 * PROBLEM STATEMENT:
 * Design a Vehicle Rental System using inheritance and runtime polymorphism.
 * Create a base class Vehicle with vehicleNumber and rentPerDay.
 * Create subclasses Car, Bike and Truck.
 *
 * RENTAL CALCULATION:
 * Car: rentPerDay * days
 * Bike: rentPerDay * days * 0.90
 * Truck: rentPerDay * days * 1.20
 *
 * INPUT:
 * 3
 * 1 CAR101 2000 3
 * 2 BIKE201 500 4
 * 3 TRUCK301 3000 2
 *
 * OUTPUT:
 * CAR101 6000.00
 * BIKE201 1800.00
 * TRUCK301 7200.00
 */
package Week9;
import java.util.*;
abstract class Vehicle{
    String vehicleNumber;
    double rentPerDay;
    Vehicle(String vehicleNumber,double rentPerDay){
        this.vehicleNumber=vehicleNumber;
        this.rentPerDay=rentPerDay;
    }
    abstract double calculateRent(int days);
}
class Car extends Vehicle{
    Car(String vehicleNumber,double rentPerDay){
        super(vehicleNumber,rentPerDay);
    }
    double calculateRent(int days){
        return rentPerDay*days;
    }
}
class Bike extends Vehicle{
    Bike(String vehicleNumber,double rentPerDay){
        super(vehicleNumber,rentPerDay);
    }
    double calculateRent(int days){
        return rentPerDay*days*0.90;
    }
}
class Truck extends Vehicle{
    Truck(String vehicleNumber,double rentPerDay){
        super(vehicleNumber,rentPerDay);
    }
    double calculateRent(int days){
        return rentPerDay*days*1.20;
    }
}
public class Task1VehicleRental{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int vehicleType=sc.nextInt();
            String vehicleNumber=sc.next();
            double rentPerDay=sc.nextDouble();
            int days=sc.nextInt();
            Vehicle vehicle;
            if(vehicleType==1){
                vehicle=new Car(vehicleNumber,rentPerDay);
            }else if(vehicleType==2){
                vehicle=new Bike(vehicleNumber,rentPerDay);
            }else{
                vehicle=new Truck(vehicleNumber,rentPerDay);
            }
            double totalRent=vehicle.calculateRent(days);
            System.out.printf("%s %.2f%n",vehicleNumber,totalRent);
        }
        sc.close();
    }
}