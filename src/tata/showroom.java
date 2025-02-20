package tata;
import java.util.Scanner;



class showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_car_in_stock=0;
    String manager_name;
    Scanner s=new Scanner(System.in);
    @Override
    public void get_details(){
        System.out.println("Showroom name : "+showroom_name);
        System.out.println("Showroom address : "+showroom_address);
        System.out.println("Total car in stock : "+total_car_in_stock);
        System.out.println("Total employees : "+total_employees);
        System.out.println("Manager name : "+manager_name);
    }
    @Override
    public void set_details(){
        System.out.println("Enter showroom details");
        System.out.print("Showroom name : ");
        showroom_name=s.nextLine();
        System.out.print("Showroom address : ");
        showroom_address=s.nextLine();
        System.out.print("Manager name : ");
        manager_name=s.nextLine();
        System.out.print("Total car in stock : ");
        total_car_in_stock=s.nextInt();
        System.out.print("Total employees : ");
        total_employees=s.nextInt();
    }
}