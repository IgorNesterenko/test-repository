package lesson_3;

/**
 * Created by neste on 19.03.2017.
 */
public class MainSwitch {
    public static void main(String[] args) {
//        int number = 1;
//        switch (number){
//            case 0:
//                System.out.println("case 0");
//        break;
//            case 1:
//                System.out.println("case 1");
//                break;
//            case 2:
//                System.out.println("case 2");
//                break;
//            default:
//                System.out.println("default");
//        }

        String name = "Vasya";
        switch (name){
            case "Vasya":
                System.out.println("case 0");

            case "Igor":
                System.out.println("case 1");

            case "Alex":
                System.out.println("case 2");

            default:
                System.out.println("default");
        }
    }
}
