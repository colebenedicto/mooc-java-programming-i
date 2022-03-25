
public class MainProgram {

    public static void main(String[] args) {
        
        Counter c = new Counter(6);
        Counter d = new Counter(900);
        
        c.increase(-2);
        d.decrease(-55);
        
        System.out.println(c);
        System.out.println(d);
    }
}
