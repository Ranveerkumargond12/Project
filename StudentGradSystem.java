import java.util.Scanner;

class StudentGradSystem {

    void studentDetails() {

        String name;
        long rollNo;
        byte java, python, c;
        short total;
        float per;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextLong();

        System.out.print("Enter Java Marks: ");
        java = sc.nextByte();

        System.out.print("Enter Python Marks: ");
        python = sc.nextByte();

        System.out.print("Enter C Marks: ");
        c = sc.nextByte();
        
        total = (short)(java + python + c);
        per = total / 3.0f;
        System.out.print("Percentage: " +per);

        

    }

    public static void main(String[] args) {
        StudentGradSystem obj = new StudentGradSystem();
        obj.studentDetails();
    }
}