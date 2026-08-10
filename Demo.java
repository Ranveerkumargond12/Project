import java.util.Scanner;
public class Demo {
    void manage(){
        String name;
        String user;
        String ifsc;
        long avail;
        long credit;
        long debit;
        short pin;
        long amount;
        String address;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name=sc.nextLine();
        System.out.println("Enter User Id: ");
        user=sc.next();
        System.out.println("Enter IFSC : ");
        ifsc=sc.next();
        System.out.println("Enter Address: ");
        address=sc.next();
        System.out.println("Enter Available Balance : ");
        avail=sc.nextLong();
        System.out.println("Enter credit : ");
        credit=sc.nextLong();
        System.out.println("Enter Debit : ");
        debit=sc.nextLong();
        System.out.println("Enter PIN : ");
        pin=sc.nextShort();
        

        System.out.println("Name:" + name);
        System.out.println("User id:" + user);
        System.out.println("IFSC Code:" + ifsc);
        System.out.println("Available Balance:" + avail);

        System.out.println("Credit Ammount:" + credit);
        System.out.println("Debit Amount:" + debit);
        System.out.println("Pin :" + pin);

        amount=avail+credit-debit;
        System.out.println("Total Amount:" + amount);

        System.out.println("Address:" + address);


        
    }
    public static void main(String[] args){
        Demo obj= new Demo();
        obj.manage();
    }
 }


