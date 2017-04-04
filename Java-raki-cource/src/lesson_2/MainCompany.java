package lesson_2;

/**
 * Created by neste on 16.03.2017.
 */
public class MainCompany {
    public  static  void main(String[] args) {
        Company noosphereCompany = new Company();
        noosphereCompany.setName("Noosphere");
        noosphereCompany.setNumberOfEmployee(350);
        noosphereCompany.setMainGoal("IT technology");

        System.out.println(noosphereCompany.getName());
        noosphereCompany.printNumberOfEmployee();
        System.out.println(noosphereCompany.getMainGoal());


            Company kiaCompany = new Company("KIA", 500, "Cars");

            System.out.println(kiaCompany.getName());
            kiaCompany.printNumberOfEmployee();
            System.out.println(kiaCompany.getMainGoal());

            Company defCompany = new Company();

        defCompany.printName();
        defCompany.printNumberOfEmployee();
        defCompany.printMainGoal();


    }
    }


