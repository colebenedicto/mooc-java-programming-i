
public class Main {

    public static void main(String[] args) {
        
        SimpleDate date1 = new SimpleDate(29, 12, 2011);
        SimpleDate date2 = new SimpleDate(30, 12, 2011);
        SimpleDate date3 = new SimpleDate(4, 11, 2011);
        
        date1.advance();
        date2.advance();
        date3.advance();
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        
        date1.advance(100);
        date2.advance(35);
        
        SimpleDate date4 = new SimpleDate(20, 12, 2011);
        date3.advance(12);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date4);
    }
}
