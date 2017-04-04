package lesson4;

/**
 * Created by neste on 28.03.2017.
 */
public class Microwave extends Elecrtonics {


    public Microwave(String model, int price, int power) {
        super(model, price, power);
    }

    public  void startBoile(){
        System.out.println("Start boile");
    }
    public void stopBoile(){
        System.out.println("Stop boile");
    }
}
