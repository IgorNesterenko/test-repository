package lesson4;

/**
 * Created by neste on 28.03.2017.
 */
public class Elecrtonics {
    protected  String model;
    protected int price;
    protected int power;

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public Elecrtonics(String model, int price, int power) {
        this.model = model;
        this.price = price;
        this.power = power;
    }

    public boolean turnOn(){
        return power > 0 ;
    }
    public boolean turnOff(){
        return power == 0;
    }
    public  int  priceDiscount(int discount){
        return this.price/discount;
    }
}
