package lesson_2;

/**
 * Created by neste on 16.03.2017.
 */
public class Company {


    private static final String COMPANY_NAME_PRINT = "Company name: ";
    private static final String NUMBER_OF_EMPLOYEE_PRINT = "Number of employee: ";
    private static final String MAIN_GOAL_PRINT = "MainGoal: ";
    private  String name = "Def Company";
    private int numberOfEmployee = 200;
    private  String mainGoal = "Make money";

    public  Company(){

    }
    public Company(String name, int numberOfEmployee, String mainGoal) {
        this.name = name;
        this.numberOfEmployee = numberOfEmployee;
        this.mainGoal = mainGoal;
    }

    public String getName() {
        return  name;
    }
    public void  printName(){
        print(COMPANY_NAME_PRINT, name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployee() {
        return  numberOfEmployee;
    }
     public  void  printNumberOfEmployee(){
         print(NUMBER_OF_EMPLOYEE_PRINT, numberOfEmployee);
     }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public String getMainGoal() {
        return  mainGoal;
    }
    public  void  printMainGoal(){
        print(MAIN_GOAL_PRINT, mainGoal);
    }
    public void setMainGoal(String mainGoal) {
        this.mainGoal = mainGoal;
    }
    public  void  print(String printName, Object value){
        System.out.println(printName + value);
    }
}
