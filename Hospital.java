import java.util.*;
public class Hospital {
    Scanner sc = new Scanner(System.in);
    
   boolean isPatientAdded=false;
   void viewPatient(){
       if(!isPatientAdded){
        System.out.print("\nGo and Add Patient First");
       }
       else{
         System.out.print("View Patient Details\n");
        System.out.println("Patient Id: "+patientId);
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient Age: "+patientAge);
        System.out.println("Patient Gender: "+patientGender);
        System.out.println("Patient Dieseas: "+patientDisease);
       }
    }
  
   int patientId[] =new int[100];
   String patientName[] =new String[100];
   int patientAge[] =new int[100];
   String patientGender[] =new String[100];
   String patientDisease[] =new String[100];
   String patientDoctor[] =new String[100];

    void addPatient() {
        System.out.println("Patient Information");
        for(int i=0; i<patientId.length; i++)
        {
        System.out.println("Patient ID");
        patientId[0]=sc.nextInt();
        System.out.println("Patient Name ");
        patientName[0]=sc.nextLine();
        sc.nextLine();
        System.out.println("Age");
        patientAge[0]=sc.nextInt();
        sc.nextLine();
        System.out.println("Gender");
        patientGender[0]=sc.nextLine();
        System.out.println("Disease");
        patientDisease[0]=sc.nextLine();
        System.out.println("Doctor Name");
        patientDoctor[0]=sc.nextLine();
        }
    }

    void mainMenu() {
        System.out.println("\n------Main Menu------");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Search Patient ");
        System.out.println("4. Call Next Patient");
        System.out.println("5. View Waiting Queue");
        System.out.println("6. Sort Patients");
        System.out.println("7. Update Patient");
        System.out.println("8. Remove Patient");
        System.out.println("9. Hospital Report");
        System.out.println("10. Exit");
    }

    public static void main(String[] args) {
        Hospital obj = new Hospital();
        int choice;
        do{
            obj.mainMenu();
            System.out.println("Enter your choice: ");
            choice = obj.sc.nextInt();
            switch(choice) {
                case 1:
                    obj.addPatient();
                case 2:
                    obj.viewPatient();
                case 10:
                    break;
            }
        } while (choice != 10);
    }
}
