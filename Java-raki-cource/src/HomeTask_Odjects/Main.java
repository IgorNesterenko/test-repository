package HomeTask_Odjects;

/**
 * Created by neste on 03.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4, "Kia", 1.6);
        System.out.println(car.getModel());
        System.out.println(car.getDoors());
        System.out.println(car.getMotor());

        Moto moto = new Moto(2, 0, "Suzuki", 1.0);
        System.out.println(moto.getWheels());
        System.out.println(moto.getDoors());
        System.out.println(moto.getModel());
        System.out.println(moto.getMotor());
    }
}
