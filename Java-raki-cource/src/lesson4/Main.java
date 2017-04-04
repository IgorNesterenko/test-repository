package lesson4;

/**
 * Created by neste on 28.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("LG", 100, 220);
        System.out.println(microwave.getModel());
        System.out.println(microwave.getPower());
        System.out.println(microwave.getPrice());
        microwave.startBoile();

        Teepot teepot = new Teepot("Philips", 200, 110);
        System.out.println(teepot.getModel());
        System.out.println(teepot.getPower());
        System.out.println(teepot.getPrice());
        System.out.println(teepot.getWaterTempperature());
    }
}