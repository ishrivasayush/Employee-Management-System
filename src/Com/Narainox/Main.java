package Com.Narainox;
import java.util.Scanner;

public class Main {
    static boolean ordering = true;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeServices service=new EmployeeServices();
        do {
            menu();
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
            switch(choice) {

                case 1:
                    System.out.println("Add Employee");
                    service.addEmployee();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmployeesById();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmployee();
                    break;
                case 5:
                    System.out.println("view All Employee");
                    service.viewAllEmployee();
                    break;
                case 6:
                    System.out.println("Thank you for using application!!");
                    System.exit(0);

                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }while(ordering);
    }
    public static void menu() {
        System.out.println("****************Welcome To Employee Management System *********** "
                + "\n1. Add Employee "
                + "\n2. View Employee"
                + "\n3. Update Employee"
                + "\n4. Delete Employee"
                + "\n5. View All Employee"
                + "\n6. Exist ");
    }
}
