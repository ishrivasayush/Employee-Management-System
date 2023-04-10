package Com.Narainox;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeServices {
    HashSet<Employee> hashSet=new HashSet<>();
    Scanner scanner=new Scanner(System.in);
    Employee emp1=new Employee(101, "Shital", 24, "Developer", "IT", 25000);
    Employee emp2=new Employee(102, "Meena", 26, "Tester","CO", 57000);
    Employee emp3=new Employee(103, "Bob", 20, "DevOps Eng","Admin", 5000);
    Employee emp4=new Employee(104, "Max", 27, "System Eng","CO",  70000);

    public EmployeeServices()
    {
        hashSet.add(emp1);
        hashSet.add(emp2);
        hashSet.add(emp3);
        hashSet.add(emp4);
    }
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    //view All The Employees
    void viewAllEmployee()
    {
        for(Employee employee:hashSet)
        {
            System.out.println(employee);
        }
    }

    //view Employees by id
    void viewEmployeesById()
    {
        System.out.println("Enter The Id:");
        id=scanner.nextInt();
        boolean found=false;
        for (Employee employee:hashSet) {
            if (employee.getEmployeeId()==id)
            {
                System.out.println(employee);
                found=true;
            }
        }
        if (!found)
        {
            System.out.println("Employee not Found !");
        }
    }
    void deleteEmployee()
    {
        System.out.println("Enter Employee Id:");
        id=scanner.nextInt();
        boolean found=false;
        Employee employee1=null;
        for(Employee employee:hashSet) {
            if (employee.getEmployeeId() == id) {
                employee1=employee;
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("Employee Not Found!!");
        }
        else {
            hashSet.remove(employee1);
            System.out.println("Employee Remove SuccessFully!!");
        }
    }

    //Update Employee By id
    void updateEmployee()
    {
        System.out.println("Enter Employee Id:");
        id=scanner.nextInt();
        boolean found=false;
        for(Employee employee:hashSet)
        {
            if(employee.getEmployeeId()==id)
            {
                System.out.println("Enter the Employee Name:");
                name=scanner.nextLine();
                employee.setEmployeeName(name);
                System.out.println("Enter the Employee Designation:");
                designation=scanner.nextLine();
                employee.setEmployeeDesiganation(designation);
                System.out.println("Enter the Employee Department:");
                department=scanner.nextLine();
                employee.setEmployeeDepartment(department);
                System.out.println("Enter the Employee Salary:");
                sal=scanner.nextDouble();
                employee.setEmployeeSalary(sal);
                found=true;
            }
        }
        if (!found)
        {
            System.out.println("Employee Not Found!");
        }
        else {
            System.out.println("Employee Updated SuccessFully!!");
        }
    }

    //Add the Employee
    void addEmployee()
    {
        System.out.println("Enter id:");
        id=scanner.nextInt();
        System.out.println("Enter name");
        name=scanner.next();
        System.out.println("Enter age");
        age=scanner.nextInt();
        System.out.println("enter Desiganation");
        designation=scanner.next();
        System.out.println("Enter Department");
        department=scanner.next();
        System.out.println("Enter sal");
        scanner.nextDouble();

        Employee employee=new Employee(id,name,age,designation,department,sal);
        hashSet.add(employee);

        System.out.println("Employee is added Successfully!!");
    }
}
