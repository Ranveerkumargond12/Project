import java.util.*;
public class LibraySystem {
    Scanner sc = new Scanner(System.in);
    int BookId,avlBook,TotalBook;
    String BookName="", BookAuthor="",BookCategry="";
    boolean isBookAdded=false;
    void viewBook(){
       if(!isBookAdded){
        System.out.print("----Go and Add Book First----");
       }
       else{
         System.out.print("----View Book Details----\n");
        System.out.println("Book Id: "+BookId);
        System.out.println("Book Name: "+BookName);
        System.out.println("Book Author: "+BookAuthor);
        System.out.println("Book Category: "+BookCategry);
        System.out.println("Total Book: "+TotalBook);
       }
    }
    void searchBook(){
        if(!isBookAdded){
        System.out.println("----Go and Add Book First----");
       }
       
       else{
        int newId;
        System.out.print("Enter Book Id: ");
        newId=sc.nextInt();
        if (BookId==newId) {
            viewBook();
            
        }
        else{
            System.out.println("----Book Not Found----");
        }
       }
        
    }

    void addBook(){
        System.out.print("----Add Your Book----\n");
        System.out.print("Enter Book Id: ");
        BookId=sc.nextInt();
        System.out.print("Enter Book Name: ");
        sc.nextLine();
        BookName=sc.nextLine();
        System.out.print("Enter Book Author: ");
        BookAuthor=sc.nextLine();
        System.out.print("Enter Book Categry: ");
        BookCategry=sc.nextLine();
        System.out.print("Enter Total Book: ");
        TotalBook=sc.nextInt();
        avlBook=TotalBook;
        isBookAdded=true;
    }
    void mainMenu() {
        System.out.println("----Libray Managment----\n");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Search Books");
        System.out.println("4. Issue Books");
        System.out.println("5. Return Books");
        System.out.println("6. Delete Books");
        System.out.println("7. Library Report");
        System.out.println("8. Exit");
    }
    public static void main(String[] args) {
        LibraySystem obj = new LibraySystem();
        obj.mainMenu();
        int choice;
        do{
            obj.mainMenu();
            System.out.println("Enter your choice: ");
            choice = obj.sc.nextInt();
            switch(choice) {
                case 1:
                     obj.addBook();
                    break;
                case 2:
                     obj.viewBook();
                    break;
                case 3:
                     obj.searchBook();
                    break;
                case 8:
                    System.out.println("Thanku....");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 8);
    }
}
