// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Car {
    int startMiles; // Starting odometer reading
    int endMiles; // Ending odometer reading
    double gallonsUsed; // Gallons of gas used between the readings
    
    public static void main(String[]args){
        Car auto = new Car(15);
        System.out.println("New car odometer reading: ");
        auto.fillUp(150,8);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(350, 10);
        auto.fillUp(450, 20);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(603, 25.5);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
    }

    // Creates a new instance of a Car object with the starting
    // odometer readings.
    Car(int odometerReading) {
        startMiles = odometerReading;
    }

    // Simulates filling up the tank. Record the current odometer reading
    // and the number of gallons to fill the tank.
    void fillUp(int odometerReading, double gallons) {
        endMiles = odometerReading;
        gallonsUsed += gallons;
    }

    // Calculates and returns the miles per gallon for the car
    double calculateMPG() {
        return (endMiles - startMiles) / gallonsUsed;
    }

    // Resets the myStartMiles to the current odometer reading and
    // resets the gallons used to zero.
    void resetMPG() {
        startMiles = endMiles;
        gallonsUsed = 0;
    }
}
