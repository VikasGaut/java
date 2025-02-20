package tata;
import java.util.Scanner;
import java.util.UUID;

class employee extends showroom implements utility{
    String emp_name,emp_id,emp_department;
    int emp_age;
    Scanner s=new Scanner(System.in);
    @Override
    public void get_details(){
        System.out.println("Employee name :"+emp_name);
        System.out.println("Employee id :"+emp_id);
        System.out.println("Employee department : "+emp_department);
        System.out.println("Employee age :"+emp_age);
    }
    @Override
    public void set_details(){
        System.out.print("Employee name : ");
        emp_name=s.nextLine();
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.print("Employee department : ");
        emp_department=s.nextLine();
        System.out.print("Employee age :");
        emp_age=s.nextInt();
    }
}