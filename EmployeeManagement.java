import java.util.Scanner;

public class EmployeeManagement{
    Scanner sc = new Scanner(System.in);
    int Eid, age,salary;
    String gender="", Name="", Department="";
    boolean isEmployee=false;

void search(){
if(isEmployee==false)
{
    System.out.println("First Add Employee Details Then View");
}
 else{
        int newId;
        System.out.print("Enter Employee Id: ");
        newId=sc.nextInt();
        if (Eid==newId) {
            view();
            
        }
        else{
            System.out.println("Employee Not Found");
        }
       }
}

     void view(){
       if(!isEmployee){
        System.out.print("Go and Add Employee First");
       }
       else{
         System.out.println("View Employee Details\n");
         System.out.println("View Employee id: " +Eid);
         System.out.println("View Employee Salary: " +salary);
         System.out.println("View Employee Name: "+Name);
         System.out.println("View Employee Age: "+age);
         System.out.println("View Employee Gender: "+gender);
         System.out.println("View Employee Department: "+Department);
    }}

    void addemp(){
        System.out.println("Add Employee Details");
        System.out.println("Add Employee Id");
        Eid=sc.nextInt();
        System.out.println("Add Employee Salary");
        salary=sc.nextInt();
        System.out.println("Add Employee Name");
        sc.next();
        Name=sc.nextLine();
        System.out.println("Add Employee Age");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Add Employee Gender");
        gender=sc.nextLine();
        System.out.println("Add Employee Department");
        Department=sc.nextLine();
         isEmployee=true;
    }
     void mainMenu() {
        System.out.println("Employee Management\n");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Search Employees");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
    }
    public static void main(String[] args) {
        EmployeeManagement obj = new EmployeeManagement();
        obj.mainMenu();
        int choice;
        do{
            obj.mainMenu();
            System.out.println("Enter your choice: ");
            choice = obj.sc.nextInt();
            switch(choice) {
                case 1:
                     obj.addemp();
                    break;
                case 2:
                     obj.view();
                    break;
                case 3:
                     obj.search();
                    break;
                case 6:
                    System.out.println("Thanku....");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 6);
       
}
}
