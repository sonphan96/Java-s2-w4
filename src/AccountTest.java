
/**
 * Test code for Customer and Account
 * @author Sam Scott
 */
public class AccountTest {
    
     public static void main(String[] args) {
         Account a1 = new Account(11111);
         Account a2 = new Account(22222, 10000.00);
         Customer c = new Customer("Josephine Smith", a1, a2);
         System.out.println(c);
         
         System.out.println("\nNow Depositing to account 1 and withdrawing from account 2\n");
         c.deposit(1, 999.99);
         c.withdraw(2, 83.23);
         System.out.println(c);
     }
}
