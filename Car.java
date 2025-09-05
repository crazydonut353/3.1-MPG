public class Car {
    int startMiles; // Starting odometer reading
    int endMiles; // Ending odometer reading
    double gallonsUsed; // Gallons of gas used between the readings

    // Creates a new instance of a Car object with the starting
    // odometer readings.
    Car(int startMiles) {
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
    void resetMPG(int odometerReading) {
        startMiles = odometerReading;
        gallonsUsed = 0;
    }
}
