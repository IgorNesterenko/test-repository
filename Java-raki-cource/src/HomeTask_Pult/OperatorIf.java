package HomeTask_Pult;

import java.util.Scanner;

/**
 * Created by neste on 20.03.2017.
 */
public class OperatorIf {
    public static void main(String[] args) {
        String [] channel = {"1+1", "Football", "TNT", "Inter", "NLO", "2+2", "Discovery", "ICTV", "TV1000", "BBC"};
        System.out.println("Enter button from 0 to 9");
        Scanner scn = new Scanner(System.in);
        int button = scn.nextInt();
        if (button == 0) {
           System.out.println(channel[0]);
        } else if(button==1){
            System.out.println(channel[1]);
        } else if (button ==2){
            System.out.println(channel[2]);
        } else if (button ==3){
            System.out.println(channel[3]);
        } else  if (button==4){
            System.out.println(channel[4]);
        } else  if (button==5){
            System.out.println(channel[5]);
        }else if (button==6){
            System.out.println(channel[6]);
        } else if (button==7){
            System.out.println(channel[7]);
        } else if (button==8){
            System.out.println(channel[8]);
        }else if (button==9){
            System.out.println(channel[9]);
        } else {
            System.out.println("No TV channel");
        }
    }

}
