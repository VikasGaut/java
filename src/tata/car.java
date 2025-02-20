package tata;
import java.util.Scanner;

class car extends showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_transmission;

    Scanner s=new Scanner(System.in);
    @Override
    public void get_details(){
        System.out.println("Car name :"+car_name);
        System.out.println("Car color :"+car_color);
        System.out.println("Car fuel type :"+car_fuel_type);
        System.out.println("Car price :"+car_price);
        System.out.println("Car transmission :"+car_transmission);
    }
    @Override
    public void set_details(){
        System.out.print("Car name : "+car_name);
        car_name=s.nextLine();
        System.out.print("Car color :"+car_color);
        car_color=s.nextLine();
        System.out.print("Car fuel type : "+car_fuel_type);
        car_fuel_type=s.nextLine();
        System.out.print("Car transmission :"+car_transmission);
        car_transmission=s.nextLine();
        System.out.print("Car price :"+car_price);
        car_price=s.nextInt();
    }
}