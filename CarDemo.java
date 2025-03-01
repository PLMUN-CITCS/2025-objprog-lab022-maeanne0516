// Car class definition
class Car {
    // Attributes (Data fields) for the Car class
    String make;  // The make of the car (e.g., Toyota)
    String model; // The model of the car (e.g., Corolla)
    int year;     // The manufacturing year of the car (e.g., 2020)

    // Method to display the car's information
    public void displayInfo() {
        // Print out the car's information in the format: "Car: [year] [make] [model]"
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class that runs the program
public class CarDemo {
    public static void main(String[] args) {
        // Create an object (instance) of the Car class named myCar
        Car myCar = new Car();

        // Assign values to the attributes of the myCar object
        myCar.make = "Toyota";   // Setting the make to Toyota
        myCar.model = "Corolla"; // Setting the model to Corolla
        myCar.year = 2020;       // Setting the year to 2020

        // Call the displayInfo method on the myCar object to print the car's information
        myCar.displayInfo();
    }
}
