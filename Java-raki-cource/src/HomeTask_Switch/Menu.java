package HomeTask_Switch;

import java.util.Scanner;

/**
 * Created by neste on 27.03.2017.
 */
public class Menu {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Choose page of menu");
        System.out.println("For exit from menu type Exit");
        String menu;
        while (!(menu = scn.nextLine()).equalsIgnoreCase("Exit")) {

            switch (menu) {
                case "1":
                    System.out.println("Bread");
                    break;
                case "2":
                    System.out.println("Borsh");
                    break;
                case "3":
                    System.out.println("Meat");
                    break;
                case "4":
                    System.out.println("Cake");
                    break;
                case "5":
                    System.out.println("Beaf");
                    break;
                case "6":
                    System.out.println("Pork");
                    break;
                case "7":
                    System.out.println("Chicken");
                    break;

            }
        //    menu = scn.nextLine();
        }
    }
}


