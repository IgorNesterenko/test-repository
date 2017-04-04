package lesson4;

/**
 * Created by neste on 28.03.2017.
 */
public class Teepot extends Elecrtonics {
    private int waterTempperature;

    public Teepot(String model, int price, int power) {
        super(model, price, power);
    }
    public  int getWaterTempperature(){
        return power*price;
    }


}
