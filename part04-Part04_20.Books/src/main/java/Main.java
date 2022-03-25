import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String bookTitle = scan.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
        
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
        
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scan.nextLine());
        
            books.add(new Book(bookTitle, pages, pubYear));
        }
        
        System.out.println("What information will be printed? ");
        String neededInfo = scan.nextLine();
        
        for (Book e: books) {
            if (neededInfo.equals("everything")) {
                System.out.println(e);
            } else if (neededInfo.equals("name")) {
                System.out.println(e.getTitle());
            }
        }
    }
}
