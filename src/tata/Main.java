package tata;
import java.util.Scanner;


interface utility{
    public void get_details();
    public void set_details();
}

public class Main {
     static void main_menu() {
        System.out.println();
        System.out.println("==========================Car Management System==========================");
        System.out.println("1 : ADD SHOWROOMS \t\t\t 2 : ADD EMPLOYEES \t\t\t 3 : ADD CARS");
        System.out.println();
        System.out.println("4 : GET SHOWROOMS \t\t\t 5 : GET EMPLOYEES \t\t\t 6 : GET CARS");
        System.out.println();
        System.out.println("Press 0 to ======EXIT======");
    }

    public static void main(String[] args) {
        showroom showroom[] = new showroom[5];
        car car[] = new car[5];
        employee employee[] = new employee[5];
        Scanner s = new Scanner(System.in);
        int car_counter = 0;
        int showroom_counter = 0;
        int employee_counter = 0;
        int choice = 1;
        while (choice != 0) {
            main_menu();
            choice = s.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {

                    case 1:
                        showroom[showroom_counter] = new showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
//                        System.out.println("1 : Add new showroom");
//                        System.out.println("9 : Go back to main menu");
                        main_menu();
                        choice = s.nextInt();
                        break;
                    case 2:
                        employee[employee_counter] = new employee();
                        employee[employee_counter].set_details();
                        employee_counter++;
//                        System.out.println("2 : Add new employee");
//                        System.out.println("9 : Go back to main menu");
                        main_menu();
                        choice = s.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new car();
                        car[car_counter].set_details();
                        car_counter++;
//                        System.out.println("3 : Add new car");
//                        System.out.println("9 : Go back to main menu");
                        main_menu();
                        choice = s.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
//                        System.out.println("1 : Add new showroom");
//                        System.out.println("9 : Go back to main menu");
                        main_menu();
                        choice = s.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employee_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
//                        System.out.println("2 : Add new employee");
//                        System.out.println("9 : Go back to main menu");
                        main_menu();
                        choice = s.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
//                        System.out.println("1 : Add new car");
//                        System.out.println("9 : Go back to main menu");
                        main_menu();
                        choice = s.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
//                        System.out.println("1 : Add new showroom");
//                        System.out.println("9 : Go back to main menu");
                        main_menu();
                        choice = s.nextInt();
                        break;


                }
            }
        }
    }
}
