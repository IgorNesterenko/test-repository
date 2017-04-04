package HomeTask_Odjects;

/**
 * Created by neste on 29.03.2017.
 */
public class Machiines {
protected int wheels;
protected int doors;
protected String model;
protected  double motor;


    public Machiines(int wheels, int doors, String model, double motor) {
        this.wheels = wheels;
        this.doors = doors;
        this.model = model;
        this.motor = motor;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public double getMotor() {
        return motor;
    }
}
