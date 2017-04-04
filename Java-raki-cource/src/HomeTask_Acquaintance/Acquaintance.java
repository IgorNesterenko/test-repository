package HomeTask_Acquaintance;

import java.util.Scanner;

/**
 * Created by neste on 25.03.2017.
 */
public class Acquaintance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       // String question = scn.nextLine();


        System.out.println("Hi");
        //String answer = scn.nextLine();
        System.out.println("What is your name");
        String answer1 = scn.nextLine();
        if (answer1.contains("gor")){
            System.out.println("My name is Ann");
        }
        else System.out.println("Fuck you!");

    }

}
