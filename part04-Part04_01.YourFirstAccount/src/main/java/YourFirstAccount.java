
public class YourFirstAccount {

    public static void main(String[] args) {
       
        Account cole = new Account("Cole's Account", 100.0);
        
        cole.deposit(20.0);
        
        System.out.println(cole);
    }
}
