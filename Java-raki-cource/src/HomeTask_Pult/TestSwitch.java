package HomeTask_Pult;

import java.util.Scanner;

/**
 * Created by neste on 27.03.2017.
 */
public class TestSwitch {
    public static void main(String[] args) {

        for (int i = 0; i<5; i++  ){

            switch (i){

                case 0:
                    System.out.println("test");
                    break;
                case 2:
                    System.out.println("Close");
                    break;
                case 3:
                    Scanner scn = new Scanner(System.in);
                    String point = scn.nextLine();

                    System.out.println(point);
            }
        }
    }
}
