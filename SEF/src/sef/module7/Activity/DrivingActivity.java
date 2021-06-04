package sef.module7.Activity;

public class DrivingActivity {

    public static void main(String arg[]){

        Moving d1 = new Car();
        Moving d2 = new Motorcycle();

        Driver b = new Driver("Rolands ");

        b.setMoving(d1);
        b.driverStartsDriving();

        b.setMoving(d2);
        b.driverStartsDriving();
    }

}
